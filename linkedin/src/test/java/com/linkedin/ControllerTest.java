package com.linkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.utility.ControllerFactory;

public class ControllerTest {
	
	private LinkedinControllerInterface li;

	@Before
	public void setUp() throws Exception {
		li=ControllerFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
		li=null;
	}

	@Test
	public void testCreateProfileController() {
		int i=li.createProfileController();
		assert i>0:"profile creation failed";
	}

	@Test
	public void testViewProfileController() {
		int i=li.viewProfileController();
		assert i>0:"profile not found";
	}

}
