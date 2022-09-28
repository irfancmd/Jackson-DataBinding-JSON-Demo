package com.example.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Convert JSON file to Java POJO
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// Print data
			System.out.println("First Name: " + student.getFirstName());
			System.out.println("Last Name: " + student.getLastName());
			
			Address address = student.getAddress();
			
			System.out.println("Street: " + address.getStreet());
			System.out.println("City: " + address.getCity());
			
			for(String language : student.getLanguages()) {
				System.out.println(language);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
