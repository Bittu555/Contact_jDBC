package com.example.contactApplication;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.contactApplication.service.Serviceimpl;

@SpringBootApplication
public class ContactApplication {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
		
		Serviceimpl service = new Serviceimpl();
		boolean flag = true;

		while (flag) {
			System.out.println("1.Add Contact Details");
			System.out.println("2.Get Contact Details");
			System.out.println("3.Update Contact Details");
			System.out.println("4.Delete Contact Details");
			
			System.out.println("Enter Choice : ");
			int ch = sc.nextInt();
			switch (ch) {

				case 1: {

					service.addContactDetails();
					break;
				}

				case 2: {

                  service.GetContactDetails();
					break;
				}

				case 3: {

                  service.upddateContactDetails();
					break;
				}

				case 4: {

                  service.DeleteContactDetails();
					break;
				}
	}
		
		}}}

