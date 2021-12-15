package com.whatsapp.service;


import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService {
	
	
	
	public int createProfileService(WhatsappUser w) {
		WhatsappDAO d=new WhatsappDAO();
		return d.createProfileDAO(w);
	}
	
	public WhatsappUser[] viewAllProfileService() {
		WhatsappDAO d=new WhatsappDAO();
		return d.viewAllProfileDAO();
	}

}
