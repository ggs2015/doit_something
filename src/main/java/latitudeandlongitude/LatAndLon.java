package latitudeandlongitude;

import java.math.BigDecimal;

public class LatAndLon {
	//	经度：longitude；纬度：Latitude
	//	lng_1000:0.01038   lat_1000:0.00899
	//经度系数
	private final static double LNG_1000 = 0.01038;
	//纬度系数
	private final static double LAT_1000 = 0.00899;

	public static void main(String[] args) {
		
		BigDecimal latStart = new BigDecimal(90);
		BigDecimal lngStart = new BigDecimal(17);
		BigDecimal latEnd = new BigDecimal(90);
		BigDecimal lngEnd = new BigDecimal(18);
		BigDecimal length = getLenByLatAndLng(latStart, lngStart, latEnd, lngEnd);
		System.out.println(length.toString());
	}

	/**
	 * 计算经度之间的直线距离
	 * @param startLon
	 * @param endLon
	 * @return
	 */
	static private BigDecimal longitudeLength(BigDecimal startLng, BigDecimal endLng){
		BigDecimal length = null;
		//四舍五入保留两位小数
//		startLon = startLon.setScale(2, BigDecimal.ROUND_HALF_UP);
//		endLon = endLon.setScale(2, BigDecimal.ROUND_HALF_UP);
		length = endLng.subtract(startLng).multiply(new BigDecimal(1000)).divide(new BigDecimal(LNG_1000), 4);
		length = length.setScale(2, BigDecimal.ROUND_HALF_UP);
		return length;
	}
	
	/**
	 * 计算纬度之间的距离
	 * @param startLat
	 * @param endLat
	 * @return
	 */
	static private BigDecimal latitudeLength(BigDecimal startLat, BigDecimal endLat){
		BigDecimal length = null;
		length = endLat.subtract(startLat).multiply(new BigDecimal(1000)).divide(new BigDecimal(LAT_1000),4);
		length = length.setScale(2, BigDecimal.ROUND_HALF_UP);
		return length;
	}
	
	/**
	 * 计算两个点之间的距离
	 * @param lat
	 * @param lng
	 * @return
	 */
	static private BigDecimal latAndLogLength(BigDecimal lat, BigDecimal lng){
		BigDecimal length = null;
		//求平方
		BigDecimal lat2 = lat.multiply(lat);
		BigDecimal lng2 = lng.multiply(lng);
		//算平方根，按照直角三角形计算距离
		double len = Math.sqrt(lat2.add(lng2).doubleValue());
		length = new BigDecimal(len).setScale(2, BigDecimal.ROUND_HALF_UP);
		return length;
	}
	
	/**
	 * 通过经纬度，计算两点之间的距离
	 * @param latStart
	 * @param lngStart
	 * @param latEnd
	 * @param lngEnd
	 * @return
	 */
	static public BigDecimal getLenByLatAndLng(BigDecimal latStart, BigDecimal lngStart,BigDecimal latEnd, BigDecimal lngEnd){
		BigDecimal latLength = latitudeLength(latStart, latEnd);
		BigDecimal lngLength = longitudeLength(lngStart, lngEnd);
		BigDecimal length = latAndLogLength(latLength, lngLength);
		return length;
	}
	
}
