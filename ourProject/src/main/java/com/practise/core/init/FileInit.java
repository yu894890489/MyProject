package com.practise.core.init;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.practise.core.context.SpringContext;
import com.practise.core.util.ConfigUtils;
import com.practise.core.util.FileUtils;


/**
 * 主要处理文件js和css文件的合并
 * @author Administrator
 *
 */
public class FileInit {
	Log log = LogFactory.getLog(FileInit.class);
	
	public void init(){
		log.info("文件初始化");
		
		this.mergeCommonCss();
		this.mergeCommonJs();
		//合并Js
		this.margeJs();
		//合并Css
		this.margeCss();
		log.info("文件初始化完成");
	}
	
	
	/**
	 * 合并js文件成js，存放在js文件夹下
	 */
	private void margeJs(){
		String jsGroup[] = ConfigUtils.getGroupName("js");
		if(jsGroup == null){
			log.warn("暂无合并的js");
			return ; 
		}
		for(String s:jsGroup){
			String jsPackage = ConfigUtils.getJsPackage(s);
			String []js = ConfigUtils.getJsName(s);
			try {
				FileUtils.readAndWriteFile(SpringContext.getRealPath(jsPackage), js,SpringContext.getRealPath( jsPackage), s+".js","js");
				log.info(s+".js文件合并完成！");
			} catch (Exception e) {
				log.error(s+".js文件合并失败");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 合并css文件成a.css，存放在css文件夹下
	 */
	private void margeCss(){
		String cssGroup[] = ConfigUtils.getGroupName("css");
		
		if(cssGroup == null){
			log.warn("暂无合并的css");
			return ; 
		}
		
		for(String s: cssGroup){
			String cssPackage = ConfigUtils.getCssPackage(s);
			String []css = ConfigUtils.getCssName(s);
			try {
				FileUtils.readAndWriteFile(SpringContext.getRealPath(cssPackage), css, SpringContext.getRealPath(cssPackage), s+".css","css");
				log.info(s+".css文件合并完成！");
			} catch (Exception e) {
				log.error(s+".css文件合并失败！");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 仅合并common类的js和css
	 */
	private void mergeCommonJs(){
		mergeCommon("js");
	}
	
	private void mergeCommonCss(){
		mergeCommon("css");
	}
	
	/**
	 * 合并公共文件
	 * @param mod
	 */
	private void mergeCommon(String mod){
		String [] jsGroup = ConfigUtils.getCommonName(mod);
		String jsPackage = ConfigUtils.getCommonPackage(mod);
		String commonName = ConfigUtils.getCommonMergeName(mod);
		if(jsGroup == null){
			log.warn("公共"+mod+"文件合并失败，无公共文件");
			return ; 
		}
		try {
			FileUtils.readAndWriteFile(SpringContext.getRealPath(jsPackage), jsGroup,SpringContext.getRealPath(jsPackage) ,commonName );
			log.warn("公共"+mod+"文件合并成功，文件名"+commonName+",文件路径："+SpringContext.getRealPath(jsPackage+commonName));
		} catch (Exception e) {
			log.warn("公共"+mod+"文件合并失败");
			e.printStackTrace();
		}
	}
}
