package com.doubleyou.efi.redd.lup.model;

/**
 * A currency is a type of coin. Although its intended of being only  
 * @author alvarosandoval
 *
 */
public class Currency {
	/**
	 * ISO 4217 code for the currency
	 */
	String id;
	
	/**
	 * 
	 */
	String name;
	
	/**
	 * 
	 */
	Float usaDollarEq;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getUsaDollarEq() {
		return usaDollarEq;
	}
	public void setUsaDollarEq(Float usaDollarEq) {
		this.usaDollarEq = usaDollarEq;
	}
	
	
	
}
