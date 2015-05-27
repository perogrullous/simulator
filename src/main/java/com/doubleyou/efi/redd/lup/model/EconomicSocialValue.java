package com.doubleyou.efi.redd.lup.model;


/**
 * Values /costs per year per ha of a certain feature: 
 * utility class for avoid writting the three values
 * 
 * @author alvarosandoval
 *
 */
public class EconomicSocialValue {
	
	/**
	 * The cost per ha per year
	 */
	Float cost;
	
	/**
	 * The value per ha per year
	 */
	Float value;
	
	/**
	 * The amount of labour hours per ha per year
	 */
	Float labourHours;

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Float getLabourHours() {
		return labourHours;
	}

	public void setLabourHours(Float labourHours) {
		this.labourHours = labourHours;
	}
	

}
