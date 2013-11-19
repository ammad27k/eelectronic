package com.imc.framework.action;


import com.imc.framework.bean.MobilePhoneReviews;
import com.imc.framework.bean.MobilePhones;
import com.imc.framework.common.BaseAction;
import com.imc.service.MobileService;

public class ReviewsAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7094066676316497645L;
	private String name;
	private long id;
	private String comments;
	 private String catId;
         
	public void validateAddReviews(){
		
	}
	public String addReviews(){
		try{
			
			MobilePhoneReviews reviews = new MobilePhoneReviews();
			MobilePhones phone = new MobilePhones();
			phone.setId(id);
			reviews.setMobilePhones(phone);
			reviews.setName(name);
			reviews.setReviewsDesc(comments);
			
			MobileService.persistReviews( reviews);
		}catch(Exception e){
			System.out.println("#Some error occured while adding reviews#"+e);
		}
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public void prepare() throws Exception {	
	}
        
        public String getCatId() {
         return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }
	
}
