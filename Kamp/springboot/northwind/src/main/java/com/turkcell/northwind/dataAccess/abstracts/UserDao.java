package com.turkcell.northwind.dataAccess.abstracts;

import com.turkcell.northwind.entities.concretes.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity, String>{
    UserEntity findByEmail(String email);
}
