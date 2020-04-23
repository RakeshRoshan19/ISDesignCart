package com.Rakesh.Cart.Model;

public class ProductsDetails {
	
	private String pId;
	private String pName;
	private String pDetails;
	private String pImgLink;
	
	
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDetails() {
		return pDetails;
	}
	public void setpDetails(String pDetails) {
		this.pDetails = pDetails;
	}
	public String getpImgLink() {
		return pImgLink;
	}
	public void setpImgLink(String pImgLink) {
		this.pImgLink = pImgLink;
	}
	
	public ProductsDetails(String pId, String pName, String pDetails, String pImgLink) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDetails = pDetails;
		this.pImgLink = pImgLink;
	}
	public ProductsDetails() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pDetails == null) ? 0 : pDetails.hashCode());
		result = prime * result + ((pId == null) ? 0 : pId.hashCode());
		result = prime * result + ((pImgLink == null) ? 0 : pImgLink.hashCode());
		result = prime * result + ((pName == null) ? 0 : pName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		ProductsDetails other = (ProductsDetails) obj;
		if (pDetails == null) {
			if (other.pDetails != null)
				return false;
		} else if (!pDetails.equals(other.pDetails))
			return false;
		if (pId == null) {
			if (other.pId != null)
				return false;
		} else if (!pId.equals(other.pId))
		if (pImgLink == null) {
			if (other.pImgLink != null)
				return false;
		} else if (!pImgLink.equals(other.pImgLink))
			return false;
		if (pName == null) {
			if (other.pName != null)
				return false;
		} else if (!pName.equals(other.pName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProductsDetails [pId=" + pId + ", pName=" + pName + ", pDetails=" + pDetails + ", pImgLink=" + pImgLink
				+ "]";
	}
	
}
