package com.turkcell.northwind.business.concretes;

import java.util.ArrayList;
import java.util.UUID;

import com.turkcell.northwind.business.abstracts.UserService;
import com.turkcell.northwind.business.dtos.UserDto;
import com.turkcell.northwind.core.utilities.mapping.ModelMapperService;
import com.turkcell.northwind.dataAccess.abstracts.UserDao;
import com.turkcell.northwind.entities.concretes.UserEntity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService{

    private UserDao userDao;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private ModelMapperService modelMapperService;

    public UserManager(UserDao userDao, BCryptPasswordEncoder bCryptPasswordEncoder, ModelMapperService modelMapperService) {
       this.userDao = userDao;
       this.bCryptPasswordEncoder = bCryptPasswordEncoder;
       this.modelMapperService = modelMapperService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        UserEntity user = userDao.findByEmail(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }

        return new User(user.getEmail(), user.getEncryptedPassword(), true, true, true, true, new ArrayList<>()); 
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        
        userDto.setId(UUID.randomUUID().toString());
        userDto.setEncryptedPassword(this.bCryptPasswordEncoder.encode(userDto.getPassword()));

        UserEntity user = this.modelMapperService.forRequest().map(userDto, UserEntity.class);
        this.userDao.save(user);
        return this.modelMapperService.forDto().map(user, UserDto.class);
    }

    @Override
    public UserDto getUserDetailsByEmail(String email) {
       
        UserEntity user = userDao.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException(email);
        }

        return this.modelMapperService.forDto().map(user, UserDto.class);
    }
    
}
