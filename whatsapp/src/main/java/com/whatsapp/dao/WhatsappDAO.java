package com.whatsapp.dao;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO {
private static WhatsappUser uu[] = new WhatsappUser[10];
	
	public int createProfileDAO(WhatsappUser w) {
		int i=0;
		for (int i1 = 0; i1 < uu.length; i1++) {
			if (uu[i1] == null) {
				uu[i1] = w;
				i = 1;
				break;
			}
		}
		return i;
	}
	
	public WhatsappUser[] viewAllProfileDAO() {
		return uu;
	}
}
