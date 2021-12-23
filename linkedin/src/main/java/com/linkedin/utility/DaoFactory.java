package com.linkedin.utility;

import com.linkedin.dao.LinkedinDAO;
import com.linkedin.dao.LinkedinDAOInterface;

public class DaoFactory {
	
	private DaoFactory() {
		
	}

	public static LinkedinDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new LinkedinDAO();
	}

}
