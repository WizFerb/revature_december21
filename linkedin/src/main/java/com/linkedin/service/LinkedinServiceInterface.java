package com.linkedin.service;

import java.util.List;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.entity.TimeLineEntity;

public interface LinkedinServiceInterface {

	int createProfileService(LinkedinUser lu);

	LinkedinUser viewProfileService(LinkedinUser lu);

	List<LinkedinUser> viewAllProfileService();

	int deleteProfileService(LinkedinUser lu);

	LinkedinUser loginProfileService(LinkedinUser lu);

	List<TimeLineEntity> timelineService(LinkedinUser lu);

}
