package com.practice.core.context;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;


public class SessionContext {
	
	private static SessionContext sm = null;
	private static Map<String,HttpSession> map = null ;
	
	
	/**
	 * 绉佹湁
	 */
	private SessionContext(){
		map = new HashMap<String,HttpSession>();
	}
	
	/**
	 * 鍗曚緥 
	 * @return
	 */
	public static SessionContext newInstance(){
		if(sm == null){
			synchronized (SessionContext.class) {
				if(sm == null){
					sm = new SessionContext();
				}
			}
		}
		return sm ;
	}
	
	/**
	 * 添加session
	 * @param session
	 * @return
	 */
	public void addSession(HttpSession session){
		map.put(session.getId(), session);
	}
	
	/**
	 * 删除单个session
	 */
	public synchronized boolean deleteSession(String sessionId){
		return map.remove(sessionId) != null;
	}
	
	/**
	 * 删除全部session
	 * @return
	 */
	public synchronized boolean deleteAllSession(){
		for(String str: map.keySet()){
			if(map.remove(str) == null){
				return false;
			}
		}
		return true;
	}  
	
	/**
	 * 获取session
	 * @param sessionId
	 * @return
	 */
	public HttpSession getSession(String sessionId){
		return map.get(sessionId);
	}
	
	/**
	 * 销毁sessionContext
	 */
	public synchronized void destorySessionContext(){
		deleteAllSession();
		sm = null;
	}

}
