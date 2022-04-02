package com.turkcell.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserEntity {
    
    @Id
    @Column(name="id")
    private String Id;

    @Column(name="email")
    private String email;

    @Column(name="encryptedPassword")
    private String encryptedPassword;
}
