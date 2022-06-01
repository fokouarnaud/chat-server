package com.fokouarnaud.webserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fokouarnaud.webserver.entity.Candidate;
import com.fokouarnaud.webserver.repository.CandidateRepository;

@Service
public class CandidateService {
	
	@Autowired
	private CandidateRepository repository;
	
	public Candidate saveCandidate(Candidate candidate) {
		return repository.save(candidate);
	}
	
	public List<Candidate> saveCandidates(List<Candidate> candidates){
		return repository.saveAll(candidates);
	}
	
	public List<Candidate> getCandidates(){
		return repository.findAll();
	}
	
	public Candidate getCandidatebById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Candidate getCandidateByName(String name) {
		return repository.findByName(name);
		
	}
	public String deleteCandidate(int id) {
		repository.deleteById(id);
		return "candidate removed !! "+id;
	}
	public Candidate updateCandidate(Candidate candidate) {
		Candidate existingCandidate= repository.findById(candidate.getId()).orElse(null);
		existingCandidate.setName(candidate.getName());
		existingCandidate.setKeypoints(candidate.getKeypoints());
		existingCandidate.setDescriptors(candidate.getDescriptors());
		return repository.save(existingCandidate);
	}
	
}
