package jp.co.beat.gsample

class Bike {
	
	String manufacture
	String model
	Integer frame
	String serialNo
	Double weight
	String status
	BigDecimal cost
	
	public setCost(BigDecimal newCost) {
		cost = newCost.setScale(3, BigDecimal.ROUND_HALF_UP)
	}
	
//	public String toString() {
//		return "Bike:
//			manufacture -- ${manufacturer}
//			model -- ${model}
//			frame -- ${frame}
//			serialNo -- ${serialNo}
//		"
//	}
}
