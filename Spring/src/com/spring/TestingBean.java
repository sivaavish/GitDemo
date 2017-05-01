package com.spring;

import javax.annotation.Resource;

public class TestingBean {
	
	@Resource(name="mysqlDs")
	DataSource mysqlDataSource;
	
	public void show()
	{
		System.out.println("hello"+mysqlDataSource);
	}

}
