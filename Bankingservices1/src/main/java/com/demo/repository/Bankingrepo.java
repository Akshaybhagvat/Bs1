package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Banking;

@Repository
public interface Bankingrepo extends JpaRepository<Banking, Integer>
{

}
