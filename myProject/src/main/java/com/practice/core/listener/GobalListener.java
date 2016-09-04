package com.practice.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ContextLoaderListener;

import com.practice.core.context.SessionContext;

public class GobalListener extends ContextLoaderListener  implements HttpSessionListener,ServletContextListener{

	private static SessionContext sc = null;
	private static Log log = LogFactory.getLog(GobalListener.class);
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
		HttpSession session = se.getSession();
		log.info("����session��sessionId--->"+session.getId());
		sc.addSession(session);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		HttpSession session = se.getSession();
		log.info("����session��sessionId--->"+session.getId());
		sc.removeSession(session.getId());
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		super.contextDestroyed(sce);

		log.info("��������");
		sc.removeSessionContext();
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("����������...");
		sc = SessionContext.newInstance();
		log.info("�����ɹ�");
	}

}
