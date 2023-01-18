package com.example.Election.controller.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Election.entity.Election;

import jakarta.persistence.EntityManager;

@Repository
public interface ElectionRepository extends JpaRepository<Election, Integer> {

	@Query(value = "select * from election e where e.name = ?1",nativeQuery = true)
	Election findbyName(String name);

	
	@Query(value = "select * from election e where e.vote_count = ?1",nativeQuery = true)
	List<Election> findbyvote(int temp);
	


	
	
	

}
