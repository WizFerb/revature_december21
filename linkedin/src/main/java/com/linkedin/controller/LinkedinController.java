package com.linkedin.controller;

import java.util.List;
import java.util.Scanner;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.entity.TimeLineEntity;
import com.linkedin.service.LinkedinServiceInterface;
import com.linkedin.utility.ServiceFactory;

public class LinkedinController implements LinkedinControllerInterface {

	public int createProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setName(name);
		lu.setPassword(password);
		lu.setEmail(email);
		lu.setAddress(address);
		
		LinkedinServiceInterface ls=ServiceFactory.createObject();
		
		
		return ls.createProfileService(lu);
	}

	@Override
	public int viewProfileController() {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setEmail(email);
		
		LinkedinServiceInterface ls=ServiceFactory.createObject();
		LinkedinUser lu1=ls.viewProfileService(lu);
		
		if(lu1!=null) {
			System.out.println("Name is "+lu1.getName());
			System.out.println("Password is "+lu1.getPassword());
			System.out.println("Email is "+lu1.getEmail());
			System.out.println("Address is "+lu1.getAddress());
			i=1;
		}
		
		return i;
	}

	@Override
	public int viewAllProfileController() {
		LinkedinServiceInterface ls=ServiceFactory.createObject();
		List<LinkedinUser> lu1=ls.viewAllProfileService();
		
		for(LinkedinUser lu2:lu1) {
			System.out.println("*****************************");
			System.out.println("Name is "+lu2.getName());
			System.out.println("Password is "+lu2.getPassword());
			System.out.println("Email is "+lu2.getEmail());
			System.out.println("Address is "+lu2.getAddress());
			
		}
		
		return lu1.size();
	}

	@Override
	public int deleteProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email");
		String email=sc.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setEmail(email);
		
		LinkedinServiceInterface ls=ServiceFactory.createObject();
		int lu1=ls.deleteProfileService(lu);
		return lu1;
	}

	@Override
	public int loginProfileController() {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		
		LinkedinUser lu=new LinkedinUser();
	
		lu.setPassword(password);
		lu.setEmail(email);
		
		
		LinkedinServiceInterface ls=ServiceFactory.createObject();
		LinkedinUser uu=ls.loginProfileService(lu);
		if(uu!=null) {
			System.out.println("Welcome "+uu.getName());
			
			System.out.println("press 1 to view timeline");
			System.out.println("press 2 to upload photo");
			
			System.out.println("enter your choice");
			int cc=sc.nextInt();
			
			switch(cc) {
			case 1 : List<TimeLineEntity> tresult=ls.timelineService(lu);
						for(TimeLineEntity ti:tresult) {
							System.out.println();
						}
			break;
			}
		}
		
		return 0;
	}

}





