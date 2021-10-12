package com.wposs.alfa.framework.core.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class repositoryDAO {
	
	@Autowired
	@Qualifier("jdbcMaster")
	public  JdbcTemplate jdbcTemplate;

}
