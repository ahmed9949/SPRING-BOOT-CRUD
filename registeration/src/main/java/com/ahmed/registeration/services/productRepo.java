package com.ahmed.registeration.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.registeration.model.products;

public interface productRepo extends JpaRepository< products, Integer> {

    
} 
