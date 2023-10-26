package com.learnings.capstone.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String name;
    private String password;
    private String role;

    @OneToMany
    private List<Product> product;
    
    
}
