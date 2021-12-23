package com.linkedin.utility;

import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;

public class ControllerFactory {
	
	private ControllerFactory() {
		
	}

	public static LinkedinControllerInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkedinController();
	}

}
