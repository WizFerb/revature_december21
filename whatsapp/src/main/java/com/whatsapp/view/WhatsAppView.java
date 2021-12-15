package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;

public class WhatsAppView {

	public static void main(String[] args) {
		String  ss= "y";

		while (ss.equals("y")) {
			System.out.println("***************MAIN MENU****************");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to edit profile");
			System.out.println("press 4 to delete profile");
			System.out.println("press 5 to search profile");
			System.out.println("press 6 to view all profile");

			System.out.println("Enter your choice");

			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			WhatsappController wc = new WhatsappController();

			switch (ch) {
			case 1:
				int c = wc.createProfile();
				if (c > 0) {
					System.out.println("profile created successfully");
				} else {
					System.out.println("could not create profile");
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				int c1 = wc.viewAllProfile();
				if (c1 > 0) {
					System.out.println(c1+" record found");
				} else {
					System.out.println("no record found ");
				}
				break;
			default:
				System.out.println("wrong choice");
			}
			System.out.println("want to continue press y/n");
			ss=sc.next();
		}

	}

}
