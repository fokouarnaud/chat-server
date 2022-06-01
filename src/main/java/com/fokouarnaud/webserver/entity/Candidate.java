package com.fokouarnaud.webserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidate")
public class Candidate {
	@Id
	@GeneratedValue
	private  int id;
	private  String name;
	private  String keypoints;
	private  String descriptors;
	
}
