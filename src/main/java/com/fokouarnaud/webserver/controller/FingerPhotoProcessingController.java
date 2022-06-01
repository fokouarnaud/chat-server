package com.fokouarnaud.webserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fokouarnaud.webserver.entity.FingerPhoto;

@RestController
public class FingerPhotoProcessingController {
	
	@PostMapping("/fingerphoto")
	public FingerPhoto processFingerPhoto(@RequestBody String action, @RequestBody String img ) {
		long start = System.currentTimeMillis();
        try {
			Thread.sleep(9000);
			 System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		return new FingerPhoto();
	}
}
