package com.cqupt.dormitory.model;

/**
 * 辅导员类
 * @author Bern
 *
 */
public class Teacher {
	private int id;	//逻辑主键，自增id
	private int sex;	//性别：0为男，1为女
	private int academyId;	//学院id
	
	private String tecNum;	//教工号（登录用户名）
	private String password;	//密码
	private String name;	//名字
	private String phone;	//电话
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAcademyId() {
		return academyId;
	}
	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}
	public String getTecNum() {
		return tecNum;
	}
	public void setTecNum(String tecNum) {
		this.tecNum = tecNum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
