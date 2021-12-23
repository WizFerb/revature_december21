package com.linkedin.view;

import java.util.Scanner;

import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.utility.ControllerFactory;

public class LinkedinView {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s="y";
		while(s.equals("y")) {
			
			
			System.out.println("************MAIN MENU***********");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to view all profile");
			System.out.println("press 4 to delete profile");
			System.out.println("press 5 to login profile");
			
			int ch=sc.nextInt();
			
			//always we should use factory design pattern to create object of other layer and should store result inside corresponding interface
			LinkedinControllerInterface lc=ControllerFactory.createObject();
			
			switch(ch) {
			case 1 : int i=lc.createProfileController();
					  if(i>0) {
						  System.out.println("profile created");
					  }
					  else {
						  System.out.println("could not create profile");
					  }
				break;
				
			case 2 : int i1=lc.viewProfileController();
			  if(i1>0) {
				  System.out.println("profile found");
			  }
			  else {
				  System.out.println("could not find profile");
			  }
		break;
			case 3 : int i2=lc.viewAllProfileController();
			  if(i2>0) {
				  System.out.println(i2+ " record found");
			  }
			  else {
				  System.out.println("could not find profile");
			  }
		break;
		
			case 4 : int i3=lc.deleteProfileController();
			  if(i3>0) {
				  System.out.println( " record deleted");
			  }
			  else {
				  System.out.println("could not delete profile");
			  }
		break;
			case 5 : int i4=lc.loginProfileController();
			  if(i4>0) {
				  System.out.println( " profile logedin");
			  }
			  else {
				  System.out.println("could not delete profile");
			  }
		break;
				default:System.out.println("wrong choice");
			}
			
			
			System.out.println("do you want to continue");
			s=sc.next();
		}

	}

}
