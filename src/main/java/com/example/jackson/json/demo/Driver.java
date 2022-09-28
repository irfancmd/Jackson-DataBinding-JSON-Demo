package com.example.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Convert JSON file to Java POJO
			Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// Print data
			System.out.println("First Name: " + student.getFirstName());
			System.out.println("Last Name: " + student.getLastName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
