package com.example.Election.controller.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Election.Dto.VotecountDTO;
import com.example.Election.controller.repository.ElectionRepository;
import com.example.Election.entity.Election;

@Service
public class ElectionService {

	@Autowired
	private ElectionRepository electionrepository;

	public Election savename(String name) {
		int count = 0;
		Election election = new Election();
		election.setName(name);
		election.setVote_count(count);
		electionrepository.save(election);
		return null;
	}

	public Election castvote(String name) {
		Election ele = null;
		ele = electionrepository.findbyName(name);
		System.out.println(ele.getName());
		if (name.equals(ele.getName())) {
			int add = ele.getVote_count() + 1;
			System.out.println(add);
			ele.setVote_count(add);
			ele.setId(ele.getId());
			electionrepository.save(ele);
		} else {
			System.out.println("qygqygwd");
		}
		return null;
	}

	public VotecountDTO countvote(String name) {
		VotecountDTO dto = new VotecountDTO();
		ArrayList ele1 = new ArrayList<>();
		Election ele = electionrepository.findbyName(name);
		dto.setId(ele.getId());
		dto.setVote_count(ele.getVote_count());
		return dto;
	}

	public List<Election> listvote() {
		List<Election> electionlist = electionrepository.findAll();
		return electionlist;
	}

	public List<Election> getwinner() {
		List<Election> winner = electionrepository.findAll();
		int temp = 0;
		for (Election win : winner) {
			if (temp < win.getVote_count()) {
				temp = win.getVote_count();
			}
		}
		List<Election> electionlist = electionrepository.findbyvote(temp);
		return electionlist;
	}

}
