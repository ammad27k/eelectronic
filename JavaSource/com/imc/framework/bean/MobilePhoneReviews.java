package com.imc.framework.bean;
/**
 * MobilePhoneReviews generated by hbm2java
 */
public class MobilePhoneReviews implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3377153516617677256L;
	private long id;
	private MobilePhones mobilePhones;
	private String reviewsDesc;
	private char isActive;
	private char isDeleted;
	private String name;
	

	
	public MobilePhoneReviews() {
	}

	public MobilePhoneReviews(long id, char isActive, char isDeleted) {
		this.id = id;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	public MobilePhoneReviews(long id, MobilePhones mobilePhones,
			String reviewsDesc, char isActive, char isDeleted,String name) {
		this.id = id;
		this.mobilePhones = mobilePhones;
		this.reviewsDesc = reviewsDesc;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.name = name;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MobilePhones getMobilePhones() {
		return this.mobilePhones;
	}

	public void setMobilePhones(MobilePhones mobilePhones) {
		this.mobilePhones = mobilePhones;
	}

	public String getReviewsDesc() {
		return this.reviewsDesc;
	}

	public void setReviewsDesc(String reviewsDesc) {
		this.reviewsDesc = reviewsDesc;
	}

	public char getIsActive() {
		return this.isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public char getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(char isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
