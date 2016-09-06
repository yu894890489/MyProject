package com.practise.core.context;


import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


/**
 * Spring工具类
 * @author Administrator
 */
public class SpringContext {
	
	public static ServletContext servletContext;
	public static int onLineUser = 0;
	
	/**
	 * 得到当前的ApplicationContext
	 * @param sc ServletContext
	 * @return
	 */
	public static ApplicationContext getApplicationContext(ServletContext sc){
		return WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
	}
	
	/**
	 * 从容器中得到对应的Bean
	 * @param sc ServletContext
	 * @param obj 容器中Bean的名称
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(ServletContext sc,String obj){
		return (T) getApplicationContext(sc).getBean(obj);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String obj){
		return (T) getApplicationContext(getServletContext()).getBean(obj);
	}
	
	
	
	public static String getRealPath(String name){
		String realPath = getServletContext().getRealPath(name);
		if(realPath == null){
			realPath = SpringContext.class.getClassLoader().getResource(name).getPath();
		}
		return realPath;
	}
	
	public static ServletContext getServletContext() {
		return servletContext;
	}
	
	public static void setServletContext(ServletContext sc) {
		servletContext = sc;
	}
	
	public static void setApplicationAttr(String key,Object sysConfigMap){
		servletContext.setAttribute(key,sysConfigMap);
	}

	public static Object getApplicationContextAttr(String key) {
		return servletContext.getAttribute(key);
	}
}
