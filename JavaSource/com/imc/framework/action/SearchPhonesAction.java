package com.imc.framework.action;

import com.imc.framework.common.BaseAction;

public class SearchPhonesAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2824692280181175547L;
	private String filterName;
	private String catId;

	public void prepareSearchPhonesByAjax(){
		System.out.println(filterName);
	}
	
	public String searchPhonesByAjax(){
		return SUCCESS;
	}
	
	
	@Override
	public void prepare() throws Exception {
	}
	
	public String getFilterName() {
		return filterName;
	}
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

}
