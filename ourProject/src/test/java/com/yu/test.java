package com.yu;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) throws SQLException {
		String conf="applicationContext.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		System.out.println(ac);
		DataSource d=(DataSource) ac.getBean("dbcp");
		System.out.println(d);
		System.out.println(123);
		Connection c = d.getConnection();
		System.out.println(c);
		System.out.println(d.getConnection());
//		LoginDao u=(LoginDao) ac.getBean("userMapperDao",LoginDao.class);
//		UserBean user=u.findByName("demo");
//		System.out.println(user.getId());
		//System.out.println(NoteUtil.md5("1234"));
	}
}
