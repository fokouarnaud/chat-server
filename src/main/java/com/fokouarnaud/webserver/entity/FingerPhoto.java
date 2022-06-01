package com.fokouarnaud.webserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FingerPhoto {
	private String state;
	private int current;
	private int total;
	private String status;
	private String img;
	private String descriptors;
	private String keypoints;
}
