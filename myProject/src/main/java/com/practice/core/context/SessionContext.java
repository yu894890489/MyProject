package com.practice.core.context;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

/**
 * 
 * @author 测试    测试
 *
 */
public class SessionContext {
	
	private static SessionContext sm = null;
	private static Map<String,HttpSession> map = null ;
	
	
	/**
	 * 私有
	 */
	private SessionContext(){
		map = new HashMap<String,HttpSession>();
	}
	
	/**
	 * 单例 
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
	public synchronized boolean removeSession(String sessionId){
		return map.remove(sessionId) != null;
	}
	
	/**
	 * 删除全部session
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
	public synchronized void removeSessionContext(){
		removeAllSession();
		sm = null;
	}

}
