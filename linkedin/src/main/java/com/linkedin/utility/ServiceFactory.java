package com.linkedin.utility;

import com.linkedin.service.LinkedinService;
import com.linkedin.service.LinkedinServiceInterface;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}

	public static LinkedinServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkedinService();
	}

}
