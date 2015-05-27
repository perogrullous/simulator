package com.doubleyou.efi.redd.lup.model;

import java.util.Map;



public class EcologicalZone {
	String id;
	String name;
	Boolean active;
	
	/*
	* Ecological features: carbon stocks
	*/
	Float aboveGroundBiomassCarbonStock; // t per ha
	Float belowGroundBiomassCarbonStock; // t per ha
	Float litterCarbonStock;
	Float deadWoodCarbonStock;
	
	//TODO: depending on each soilType the carbon stock in soil will be different will be different
	// these may be attributes
	Map<SoilType,Float> soilCarbonStock;
	
	/**
	 * Ecological: bio diversity value (0..1)
	 */
	float biodiversityFactor;
	
}
