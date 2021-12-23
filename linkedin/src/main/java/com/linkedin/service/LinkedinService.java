package com.linkedin.service;

import java.util.List;

import com.linkedin.dao.LinkedinDAOInterface;
import com.linkedin.entity.LinkedinUser;
import com.linkedin.entity.TimeLineEntity;
import com.linkedin.utility.DaoFactory;

public class LinkedinService implements LinkedinServiceInterface {

	public int createProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.createProfileDAO(lu);
	}

	@Override
	public LinkedinUser viewProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.viewProfileDAO(lu);
	}

	@Override
	public List<LinkedinUser> viewAllProfileService() {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.viewAllProfileDAO();
	}

	@Override
	public int deleteProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.deleteProfileDAO(lu);
	}

	@Override
	public LinkedinUser loginProfileService(LinkedinUser lu) {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.loginProfileDAO(lu);
	}

	@Override
	public List<TimeLineEntity> timelineService(LinkedinUser lu) {
		LinkedinDAOInterface ld=DaoFactory.createObject();
		return ld.timelineProfileDAO(lu);
	}

}
