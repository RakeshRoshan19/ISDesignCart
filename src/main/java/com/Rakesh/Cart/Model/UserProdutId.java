package com.Rakesh.Cart.Model;

public class UserProdutId {
	
	private String eMail;
	private String pId;
	private int qty;
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getpId() {
		return pId;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public int getQty() {
		return qty;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public UserProdutId(String eMail, String pId, int qty) {
		super();
		this.eMail = eMail;
		this.pId = pId;
		this.qty = qty;
	}
	public UserProdutId() {
		super();
	}

}
