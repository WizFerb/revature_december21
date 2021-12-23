package com.linkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linkedin.dao.LinkedinDAO;
import com.linkedin.dao.LinkedinDAOInterface;
import com.linkedin.entity.LinkedinUser;

public class DAOTesting {
	
	private LinkedinDAOInterface ld;

	@Before
	public void setUp() throws Exception {
		ld=new LinkedinDAO();
	}

	@After
	public void tearDown() throws Exception {
		ld=null;
	}

	@Test
	public void testCreateProfileDAO() {
		LinkedinUser lu=new LinkedinUser();
		lu.setName("Mohan");
		lu.setPassword("sss");
		lu.setEmail("s");
		lu.setAddress("Chennai");
		int i=ld.createProfileDAO(lu);
		
		assert i>0:"profile creation failed";
	}

	@Test
	public void testViewProfileDAO() {
		LinkedinUser lu=new LinkedinUser();
		
		lu.setEmail("s");
		
		LinkedinUser i=ld.viewProfileDAO(lu);
		
		assert i!=null:"profile not found";
	}

}
