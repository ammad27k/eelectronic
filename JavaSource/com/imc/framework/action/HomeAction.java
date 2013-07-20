package com.imc.framework.action;

import java.math.BigInteger;
import java.util.List;

import com.imc.framework.bean.MobilePhones;
import com.imc.framework.common.BaseAction;
import com.imc.service.MobileService;

/**
 * 
 * 
 * @author ammad
 *
 */
public class HomeAction extends BaseAction {

	private static final long serialVersionUID = 8503020254903349107L;


	private String phone;
	private String fancyurl;
	private List<MobilePhones> mobilePhones;
	private String limit;
	private String brand;
	private int noOfPages;
	private int start;
	private int end;
	 
	
	

	public String welcomeHome() throws Exception{
		prepareBrands();
		return SUCCESS;
	}
	
	public void getPhonesByBrandId(String fancyUrl,String strlimit) throws Exception{
		String[] split = fancyUrl.split("-");
		int limit ;
		if(strlimit == null){
			limit = 5;
		}
		else{
			limit = Integer.valueOf(strlimit);
		}
		List<MobilePhones> mobilePhones = MobileService.getAllMobilePhonesByBrands(null, new Long(split[split.length-1]),limit);
	
		setMobilePhones(mobilePhones);
		setBrand(split[0].toUpperCase());
		
		if(strlimit == null){
			BigInteger count = MobileService.getMobilePhonesCount(null, new Long(split[split.length-1]), 0);
			setNoOfPages(count.intValue());
		}
		
	}
	
	public void getPhonesByBrandIdPagination(String fancyUrl,String strlimit,int start, int end) throws Exception{
		String[] split = fancyUrl.split("-");
		int limit ;
		if(strlimit == null){
			limit = 5;
		}
		else{
			limit = Integer.valueOf(strlimit);
		}
		List<MobilePhones> mobilePhones = MobileService.getAllMobilePhonesByBrandsForPagination(null, new Long(split[split.length-1]),limit, start, end);
		setMobilePhones(mobilePhones);
		setBrand(split[0].toUpperCase());
		
	}
	
	public String phones() throws Exception{
		prepareBrands();
		getPhonesByBrandId(getFancyurl(),null);
		return SUCCESS;
	}
	
	public String phonesByAjax() throws Exception{
		getPhonesByBrandId(getFancyurl(),getLimit());
		return SUCCESS;
	}
	
	public String phonesByPagination() throws Exception{
		getPhonesByBrandIdPagination(getFancyurl(),getLimit(),Integer.valueOf(getStart()+""),Integer.valueOf(getEnd()+""));
		
		return SUCCESS;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getFancyurl() {
		return fancyurl;
	}

	public void setFancyurl(String fancyurl) {
		this.fancyurl = fancyurl;
	}

	public List<MobilePhones> getMobilePhones() {
		return mobilePhones;
	}

	public void setMobilePhones(List<MobilePhones> mobilePhones) {
		this.mobilePhones = mobilePhones;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public void prepare() throws Exception {}

	


}
