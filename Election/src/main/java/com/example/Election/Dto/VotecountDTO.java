package com.example.Election.Dto;


public class VotecountDTO {
	
	private int id;
	
	private int vote_count;
	
	

	public VotecountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VotecountDTO(int id, int vote_count) {
		super();
		this.id = id;
		this.vote_count = vote_count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

	@Override
	public String toString() {
		return "VotecountDTO [id=" + id + ", vote_count=" + vote_count + "]";
	}
	
	
	

}
