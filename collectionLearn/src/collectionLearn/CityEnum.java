package collectionLearn;

import java.util.Random;

public enum CityEnum {
	DELHI,KANPUR,AGRA,MUMBAI,KOLKATA,GWALIOR,RAIPUR,BANGLORE,MAHURA,CHENNAI,ALLAHBAD,BANARAS;

	
	public static CityEnum randomCity() {
		Random random =new Random();
		
		int pick=random.nextInt(CarModel.values().length);
		return CityEnum.values()[pick];
		
	}
}
