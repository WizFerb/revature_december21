package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;

public class WhatsappController {

	public int createProfile() {
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name ");
		String name = sc.next();

		System.out.println("Enter Password ");
		String password = sc.next();

		System.out.println("Enter Email ");
		String email = sc.next();

		System.out.println("Enter Address ");
		String address = sc.next();

		WhatsappUser wu = new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);

		WhatsappService ws=new WhatsappService();
		i=ws.createProfileService(wu);

		return i;
	}

	public int viewAllProfile() {
		int i = 0;
		
		WhatsappService ws=new WhatsappService();
		WhatsappUser uu[]=ws.viewAllProfileService();
		
		for (int i1 = 0; i1 < uu.length; i1++) {
			if (uu[i] != null) {
				System.out.println("**********************");
				System.out.println("Name is "+uu[i].getName());
				System.out.println("Password is "+uu[i].getPassword());
				System.out.println("Email is "+uu[i].getEmail());
				System.out.println("Address is "+uu[i].getAddress());
				i++;
			}
			else {
				break;
			}
		}
		
		
		return i;
	}

}



















