package com.practice.core.context;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * 
 * @author ����    ����
 *
 */
public class SessionContext {
	
	private static SessionContext sm = null;
	private static Map<String,HttpSession> map = null ;
	
	
	/**
	 * ˽��
	 */
	private SessionContext(){
		map = new HashMap<String,HttpSession>();
	}
	
	/**
	 * ���� 
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
	 * ���session
	 * @param session
	 * @return
	 */
	public void addSession(HttpSession session){
		map.put(session.getId(), session);
	}
	
	/**
	 * ɾ������session
	 */
	public synchronized boolean removeSession(String sessionId){
		return map.remove(sessionId) != null;
	}
	
	/**
	 * ɾ��ȫ��session
	 * @return
	 */
	public synchronized boolean removeAllSession(){
		for(String str: map.keySet()){
			if(map.remove(str) == null){
				return false;
			}
		}
		return true;
	}  
	
	/**
	 * ��ȡsession
	 * @param sessionId
	 * @return
	 */
	public HttpSession getSession(String sessionId){
		return map.get(sessionId);
	}
	
	/**
	 * ����sessionContext
	 */
	public synchronized void removeSessionContext(){
		removeAllSession();
		sm = null;
	}

}
