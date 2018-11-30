package edu.century.finalproject;

public class Volume {
	//switch statement converts user's current unit to liters	
	public double convertToLiters(String unitCurrent, String unitFinal, double value) {
		switch (unitCurrent) {	
		case "cubic meter": 
			value*=1000;
			break;
		default:
			break;
		}
		return convertFromLiters(unitFinal, value);
	}
	//convert liter to user's final unit choice
	private double convertFromLiters(String unitFinal, double value) {
		switch (unitFinal) {
		case "US liquid gallon":
			value /= 3.785;
			break;
		default:
			break;
		}
		return value;
	}

}
