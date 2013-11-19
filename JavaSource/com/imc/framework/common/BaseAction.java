package com.imc.framework.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.imc.framework.bean.MobileBrands;
import com.imc.service.HelperService;
import com.imc.service.MobileService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseAction extends ActionSupport implements Preparable,ServletRequestAware,SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> sessionMap;
	private HttpServletRequest request;
	private  List<MobileBrands> brandList = new ArrayList<>();
	
	
	public void prepareCategories(String catId) throws Exception {
		List<MobileBrands> list = MobileService.getAllMobileBrands(catId);

		for(MobileBrands brands : list){
			HelperService.setStringWithFirstLetterUpperCase(brands);
			brandList.add(brands);
		}
		this.sessionMap.put("sidebarMenu", brandList);
		
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
		
	}
	public HttpServletRequest getRequest(){
		return this.request;
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public List<MobileBrands> getBrandList() {
		return brandList;
	}

	
}
