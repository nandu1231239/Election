package com.example.Election.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Election {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int vote_count;
	
	

	public Election(int id, String name, int vote_count) {
		super();
		this.id = id;
		this.name = name;
		this.vote_count = vote_count;
	}

	public Election() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

	@Override
	public String toString() {
		return "Election [id=" + id + ", name=" + name + ", vote_count=" + vote_count + "]";
	}
	
	
	
	

}
