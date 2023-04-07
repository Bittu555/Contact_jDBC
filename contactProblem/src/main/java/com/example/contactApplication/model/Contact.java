package com.example.contactApplication.model;

public class Contact {

	
	public int contact_id;
    public String name;
    public String email;
    public String Adress;
    public String mobile_num;
    
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", name=" + name + ", email=" + email + ", Adress=" + Adress
				+ ", mobile_num=" + mobile_num + "]";
	}
}
