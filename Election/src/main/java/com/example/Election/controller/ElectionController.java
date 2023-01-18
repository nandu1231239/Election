package com.example.Election.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Election.Dto.VotecountDTO;
import com.example.Election.controller.service.ElectionService;
import com.example.Election.entity.Election;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ElectionController {

	@Autowired
	private ElectionService electionservice;

	Logger log = LoggerFactory.getLogger(ElectionController.class);

	@GetMapping("/Election/addname")
	public Election savename(@RequestParam String name) {
		Election respList = null;
		try {
			respList = electionservice.savename(name);
			log.info("saving name");

		} catch (Exception e) {
			log.error("Failed to save name");
		}
		return respList;
	}

	@GetMapping("/Election/castvote")
	public Election castvote(@RequestParam String name) {
		Election respList = null;
		try {
			respList = electionservice.castvote(name);
			log.info("casting vote for name",name);
		} catch (Exception e) {
			log.error("could not cast vote");
		}
		return respList;
	}

	// just created to show i have created dto even if it is not needed
	@GetMapping("/Election/countvote")
	public VotecountDTO countvote(@RequestParam String name) {
		VotecountDTO respList = null;
		try {
			respList = electionservice.countvote(name);
			log.info("counting vote for name",name);
		} catch (Exception e) {
			log.error("could not count vote");
		}
		return respList;
	}

	@GetMapping("/Election/listvote")
	public List<Election> listvote() {
		List<Election> respList = null;
		try {
			respList = electionservice.listvote();
			log.info("listing all votes for all names");
		} catch (Exception e) {
			log.error("could not list all votes for all names");
		}
		return respList;
	}

	@GetMapping("/Election/getwinner")
	public List<Election> getwinner() {
		List<Election> respList = null;
		try {
			respList = electionservice.getwinner();
			log.info("getting the winner of the election");
		} catch (Exception e) {
			log.error("could not get the winner of the election");
		}
		return respList;
	}
}
