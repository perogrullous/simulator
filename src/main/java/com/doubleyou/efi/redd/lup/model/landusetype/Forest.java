package com.doubleyou.efi.redd.lup.model.landusetype;

import com.doubleyou.efi.redd.lup.model.EconomicSocialValue;
import com.doubleyou.efi.redd.lup.model.EcologicalZone;

public class Forest {
	/**
	 * This will mark the default eco values
	 */
	EcologicalZone ecologicalZone;
	
	/**
	 * 
	 */
	Float degradationFactor;
	
	/*
	* Ecological features: carbon stocks
	*/
	Float aboveGroundBiomassCarbonStock; // t per ha
	Float belowGroundBiomassCarbonStock; // t per ha
	Float litterCarbonStock;
	Float deadWoodCarbonStock;
	Float soilCarbonStock;
	
	
	
	/* Economic/social features per ha per year: goods*/
	EconomicSocialValue timberValue;
	EconomicSocialValue fuelWoodValue;
	EconomicSocialValue charcoalValue;
	EconomicSocialValue nonTimberForestProductsValue;

	/* Economic features per ha per year: services*/
	EconomicSocialValue waterShedProtectionValue;
	EconomicSocialValue tourismValue;
	EconomicSocialValue optionAndExistenceValue;
	EconomicSocialValue otherValue;
	
}
