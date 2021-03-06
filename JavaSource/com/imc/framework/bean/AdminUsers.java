package com.imc.framework.bean;
// Generated Mar 6, 2013 10:49:21 PM by Hibernate Tools 3.4.0.CR1

/**
 * AdminUsers generated by hbm2java
 */
public class AdminUsers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4542394002329579070L;
	private Long id;
	private String name;
	private String email;
	private String password;
	private Character isActive;
	private Character isDeleted;

	public AdminUsers() {
	}

	public AdminUsers(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public AdminUsers(String name, String email, String password,
			Character isActive, Character isDeleted) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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
