package com.spring.springweb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.springweb.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	
	public List<User> findByUname(String tech);
	
	public List<User> findByUidGreaterThan(int uid);
	
	@Query("from User where uname=?1 order by tech")
	public List<User> findByUnameSorted(String tech);

}
