package com.fokouarnaud.webserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fokouarnaud.webserver.entity.Candidate;
import com.fokouarnaud.webserver.service.CandidateService;

@RestController
public class CandidateController {


		@Autowired
		private CandidateService service;

		@PostMapping("/candidate")
		public Candidate addCandidate(@RequestBody Candidate candidate) {
			return service.saveCandidate(candidate);
		}

		@PostMapping("/candidates")
		public List<Candidate> addCandidates(@RequestBody  List<Candidate>  candidates){
			return service.saveCandidates(candidates);
		}

		@GetMapping("/candidates")
		public List<Candidate> findAllCandidates(){
			return service.getCandidates();
		}

		@GetMapping("/candidate/{id}")
		public Candidate findCandidateById(@PathVariable int id) {
			return service.getCandidatebById(id);
		}

		@GetMapping("/candidate/{name}")
		public Candidate findCandidateByName(@PathVariable String name) {
			return service.getCandidateByName(name);
		}
		
		@GetMapping("/candidate/{id}/authenticate")
		public Candidate authenticateCandidate(@PathVariable int id) {
			return null;
		}
		
		@PutMapping("/candidate")
		public Candidate updateCandidate(@RequestBody Candidate candidate) {
			return service.updateCandidate(candidate);
		}
		
		@DeleteMapping("/candidate/{id}")
		public String deleteCandidate(@PathVariable int id) {
			return service.deleteCandidate(id);
		}
}
