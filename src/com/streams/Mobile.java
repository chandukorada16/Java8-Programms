package com.streams;

public class Mobile {
	
	String mobile_Holder;
	
	String mobile_Name;
	
	Double mobile_Price;
	
	String mobile_Company;
	
	
	public Mobile(String mobile_Holder,String mobile_Name,Double mobile_Price,String mobile_Company) {
		this.mobile_Holder=mobile_Holder;
		this.mobile_Name=mobile_Name;
		this.mobile_Price=mobile_Price;
		this.mobile_Company=mobile_Company;
	}


	@Override
	public String toString() {
		return "Mobile [mobile_Holder=" + mobile_Holder + ", mobile_Name=" + mobile_Name + ", mobile_Price="
				+ mobile_Price + ", mobile_Company=" + mobile_Company + "]";
	}
	

	
}