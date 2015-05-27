package com.doubleyou.efi.redd.lup.model;

import java.util.List;

public class Project {
	/**
	 * Internal id of the project
	 */
	String id;
	
	/**
	 * Label of the project (session)
	 */
	String label;
	
	/**
	 * Begin year calculation default: current year
	 */
	Integer beginYear;
	/**
	 * Amount of years to simulate
	 */
	Integer yearsToSimulate;
	
	/**
	 * Chosen ecological zone
	 */
	EcologicalZone defaultEcologicalZone;
	
	/**
	 * Chosen soil type
	 */
	SoilType defaultSoilType;
	
	/**
	 * Chosen currency
	 */
	Currency currency;
	
	/**
	 * Initial setup
	 */
	Setup initialSetup;
	
	/**
	 * List of strategies to simulate
	 */
	List<Strategy> strategies;
	
	
	// Values manageable in the results dashboard 
	/**
	 * discount rate (0..1)  
	 */
	Float discountRate;
	/**
	 * Prize in currency of each CO2 ton emitted 
	 */
	Float prizeCO2;
	
	/**
	 * Prize in currency of each hour of labour
	 */
	Float prizeLabour;
	
	/**
	 * prize for commodities in currency
	 */
	Float prizeCommodities;
	
	/**
	 * zero deforestation market access (0..1)
	 */
	Float  zeroDeforestationMarketAccess;
	
	/**
	 * Multiplies the gross benefits of specific land uses (0..1) ¿perennial crops?
	 */
	Float discountDeforestationLowerResilience;

}
