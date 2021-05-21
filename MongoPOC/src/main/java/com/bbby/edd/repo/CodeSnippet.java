package com.bbby.edd.repo;

public class CodeSnippet {
//	/*public List<InventoryByFacilities> findBySkuListAndFacilityListAndStatus(List<String> skuList, List<String> facilityNameList,char status) 
//	{
//		 Query query = new Query();
//		 query.addCriteria(Criteria.where("SKU").in(skuList)
//				 .andOperator(Criteria.where("FACILITY_PROPERTIES.Facility_name").in(facilityNameList)
//						 .andOperator(Criteria.where("FACILITY_PROPERTIES.Status").is(status))));
//	 
//		 List<InventoryByFacilities> list = mongoTemplate.find(query,
//				 InventoryByFacilities.class); return list; 
//	}*/
//	 
//	public InventoryByFacilities findByBySkuAndStore(String sku, String facilityName) 
//	{
//		Query query = new Query();
//		query.addCriteria(Criteria.where("SKU").is(sku)
//				.andOperator(Criteria.where("FACILITY_PROPERTIES.Facility_name").is(facilityName)));
//
//		log.debug("Query Created :: " + query.toString());
//		List<InventoryByFacilities> list = mongoTemplate.find(query,InventoryByFacilities.class);
//		return list.get(0);
//	}
//	 
//	public InventoryByFacilities findBySku(String sku) 
//	{
//		Query query = new Query();
//		query.addCriteria(Criteria.where("SKU").is(sku));
//		log.debug("Query Created :: " + query.toString());
//		List<InventoryByFacilities> list = mongoTemplate.find(query,InventoryByFacilities.class);
//		return list.get(0);
//	}
//	
//	public void updateBySkuAndStore(String sku, String facilityName, long availableToSell) 
//	{
//		Query query = new Query();
//		query.addCriteria(Criteria.where("SKU").is(sku)
//				.andOperator(Criteria.where("FACILITY_PROPERTIES.Facility_name").is(facilityName)));
//		Update update = new Update();
//		update.set("FACILITY_PROPERTIES.$.Facility_ATS",availableToSell );		
//		log.debug("Query Created :: " + query.toString());
//		UpdateResult result = mongoTemplate.updateFirst(query, update, InventoryByFacilities.class); 
//		log.debug("Updated Records count :: " + result.getMatchedCount());
//	}
//	
//	public void updateBopisEligibleBySku(String sku, char bopisEligible) 
//	{
//		Query query = new Query();
//		query.addCriteria(Criteria.where("SKU").is(sku));
//		Update update = new Update();
//		update.set("SKU_Properties.BOPIS",bopisEligible );		
//		log.debug("Query Created :: " + query.toString());
//		UpdateResult result = mongoTemplate.updateFirst(query, update, InventoryByFacilities.class); 
//		log.debug("Updated Records count :: " + result.getMatchedCount());
//	}
//	
//	public void updateWaterMarkQuantityForFacilityName(String facilityName, long watermarkQuantity) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("FACILITY_PROPERTIES.Facility_name").is(facilityName));
//		
//		Update update = new Update();
//		update.set("FACILITY_PROPERTIES.$.Watermark_Qty",watermarkQuantity );		
//		
//		log.debug("Query Created :: " + query.toString());		
//		UpdateResult result = mongoTemplate.updateMulti(query, update, InventoryByFacilities.class); 
//		log.debug("Updated Records count :: " + result.getMatchedCount());
//	}
}
