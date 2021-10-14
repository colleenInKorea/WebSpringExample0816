package com.ledgy98.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ledgy98.spring.lesson04.model.NewUser;

@Repository
public interface NewUserDAO {
	
	public int insertNewUser(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("introduce") String introduce, 
			@Param("email") String email
			);
	
	public NewUser selectLastUser();
	
	// lesson06 예제용 
	// count 함수를 통해서 name을 조회 하고 그 결과가 1이면 중복, 0이면 없음
	public int selectCountName(@Param("name") String name);
}
