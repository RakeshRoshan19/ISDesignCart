package com.Rakesh.Cart.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CartDetails")
public class CartDetails {
	@Id
	private String eMail;
	private List<List<Object>> pList;
	
	public String geteMail() {
		return eMail;
	}
	public void setemail(String eMail) {
		this.eMail = eMail;
	}
	
	public List<List<Object>> getpList() {
		return pList;
	}
	public void setpList(List<List<Object>> pList) {
		this.pList = pList;
	}
	public CartDetails(String eMail, List<List<Object>> pList) {
		super();
		this.eMail = eMail;
		this.pList = pList;
	}
	public CartDetails() {
		super();
	}
}
