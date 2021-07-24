package com.project.smd.user.service;

import java.util.Date;
import java.util.List;

import com.project.smd.user.dto.UserDTO;

public class UserService implements IUserService{

	@Override
	public void register(UserDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int checkId(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO selectOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void keepLogin(String sessionId, Date limitDate, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO getUserWithSessionId(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
