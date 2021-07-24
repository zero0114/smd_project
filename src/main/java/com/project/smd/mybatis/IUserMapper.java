package com.project.smd.mybatis;

import java.util.List;
import java.util.Map;

import com.project.smd.user.dto.UserDTO;

public interface IUserMapper {

	//회원가입 기능
	public void register(UserDTO user);
	
	//아이디 중복체크 기능
	public int checkId(String id);
	
	//회원탈퇴 기능
	public void delete(String account);
	
	//회원정보 조회기능
	public UserDTO selectOne(String id);
	
	//회원정보 전체 조회기능
	public List<UserDTO> selectAll();
	
	//자동로그인 쿠키값 DB저장 처리
	public void keepLogin(Map<String, Object> datas);
	
	//세션아이디를 통한 회원정보 조회기능
	public UserDTO getUserWithSessionId(String sessionId);
}









