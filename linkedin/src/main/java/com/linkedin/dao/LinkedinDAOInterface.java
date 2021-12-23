package com.linkedin.dao;

import java.util.List;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.entity.TimeLineEntity;

public interface LinkedinDAOInterface {

	int createProfileDAO(LinkedinUser lu);

	LinkedinUser viewProfileDAO(LinkedinUser lu);

	List<LinkedinUser> viewAllProfileDAO();

	int deleteProfileDAO(LinkedinUser lu);

	LinkedinUser loginProfileDAO(LinkedinUser lu);

	List<TimeLineEntity> timelineProfileDAO(LinkedinUser lu);

}
