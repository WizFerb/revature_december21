package com.linkedin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.entity.TimeLineEntity;

public class LinkedinDAO implements LinkedinDAOInterface {

	public int createProfileDAO(LinkedinUser lu) {
		int i = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("insert into linkdinuser values(?,?,?,?)");
			ps.setString(1, lu.getName());
			ps.setString(2, lu.getPassword());
			ps.setString(3, lu.getEmail());
			ps.setString(4, lu.getAddress());
			i = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public LinkedinUser viewProfileDAO(LinkedinUser lu) {
		LinkedinUser ll = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("select * from linkdinuser where email=?");

			ps.setString(1, lu.getEmail());

			ResultSet res = ps.executeQuery();

			if (res.next()) {
				ll = new LinkedinUser();
				ll.setName(res.getString(1));
				ll.setPassword(res.getString(2));
				ll.setEmail(res.getString(3));
				ll.setAddress(res.getString(4));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public List<LinkedinUser> viewAllProfileDAO() {
		List<LinkedinUser> ll1 = new ArrayList<LinkedinUser>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("select * from linkdinuser");

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				LinkedinUser ll = new LinkedinUser();
				ll.setName(res.getString(1));
				ll.setPassword(res.getString(2));
				ll.setEmail(res.getString(3));
				ll.setAddress(res.getString(4));

				ll1.add(ll);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ll1;
	}

	@Override
	public int deleteProfileDAO(LinkedinUser lu) {
		int i = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("delete from linkdinuser where email=?");

			ps.setString(1, lu.getEmail());

			i = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public LinkedinUser loginProfileDAO(LinkedinUser lu) {
		LinkedinUser ll = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("select * from linkdinuser where email=? and password=?");

			ps.setString(1, lu.getEmail());
			ps.setString(2, lu.getPassword());

			ResultSet res = ps.executeQuery();

			if (res.next()) {
				ll = new LinkedinUser();
				ll.setName(res.getString(1));
				ll.setPassword(res.getString(2));
				ll.setEmail(res.getString(3));
				ll.setAddress(res.getString(4));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public List<TimeLineEntity> timelineProfileDAO(LinkedinUser lu) {
		List<TimeLineEntity> ll1 = new ArrayList<TimeLineEntity>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rajesh");
			PreparedStatement ps = con.prepareStatement("select * from timeline where receiver=?");
			ps.setString(1, lu.getEmail());
			ResultSet res = ps.executeQuery();

			while (res.next()) {
				TimeLineEntity ll = new TimeLineEntity();
				ll.setSender(res.getString(1));
				ll.setTimeofmessage(res.getString(2));
				ll.setMessage(res.getString(3));
				ll.setReceiver(res.getString(4));

				ll1.add(ll);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ll1;
	}

}
