package com.imc.framework.bean;
// Generated Mar 6, 2013 10:49:21 PM by Hibernate Tools 3.4.0.CR1

/**
 * MobileSpeeds generated by hbm2java
 */
public class MobileSpeeds implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9194585899762080201L;
	private Long id;
	private String title;
	private Character isActive;
	private Character isDeleted;

	public MobileSpeeds() {
	}

	public MobileSpeeds(String title, Character isActive, Character isDeleted) {
		this.title = title;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Character getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	public Character getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Character isDeleted) {
		this.isDeleted = isDeleted;
	}

}
