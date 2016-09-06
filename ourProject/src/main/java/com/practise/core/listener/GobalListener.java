package com.practise.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ContextLoaderListener;

import com.practise.core.context.SessionContext;
import com.practise.core.context.SpringContext;
import com.practise.core.init.FileInit;

public class GobalListener extends ContextLoaderListener implements ServletContextListener, HttpSessionListener {

	private SessionContext sc = null;
	Log log = LogFactory.getLog(this.getClass());
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		log.info("创建session：sessionId->"+se.getSession());
		sc.addSession(se.getSession());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		log.info("销毁session：sessionId->"+se.getSession());
		sc.removeSession(se.getSession());
	}

	@Override
	public void contextDestroyed(ServletContextEvent se) {
		log.fatal("容器销毁");
		sc.removeAllSession();
		this.contextDestroyed(se);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent se) {
		log.info("容器创建");
		sc = SessionContext.newInstance();
		SpringContext.setServletContext(se.getServletContext());
		new FileInit().init();
	}

}
