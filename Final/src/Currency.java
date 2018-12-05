public class Currency {

	public double toUsd(double currency, String unit) {
		if(unit == "USD") {
			currency=currency;
		}
		if(unit == "EURO") {
			currency=currency/.86;
		}
		if(unit == "POUND") {
			currency=currency/.76;
		}
		if(unit=="YEN") {
			currency=currency/111.83;
		}
		if(unit=="PESO") {
			currency=currency/18.79;
		}
		if(unit=="CSD") {
			currency=currency/1.282;
		}
		return currency;
	}
	
	public double toEuro(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*.86;
		}
		if(unit == "EURO") {
			currency=currency;
		}
		if(unit == "POUND") {
			currency=currency/.76;
			currency=currency*.86;
		}
		if(unit=="YEN") {
			currency=currency/111.83;
			currency=currency*.86;
		}
		if(unit=="PESO") {
			currency=currency/18.79;
			currency=currency*.86;
		}
		if(unit=="CSD") {
			currency=currency/1.282;
			currency=currency*.86;
		}
		return currency;
	}
	//.78
	public double toPound(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*.76;
		}
		if(unit == "EURO") {
			currency=currency/.86;
			currency=currency*.76;
		}
		if(unit == "POUND") {
			currency=currency;
		}
		if(unit=="YEN") {
			currency=currency/111.83;
			currency=currency*.76;
		}
		if(unit=="PESO") {
			currency=currency/18.79;
			currency=currency*.76;
		}
		if(unit=="CSD") {
			currency=currency/1.282;
			currency=currency*.76;
		}
		return currency;
	}
	//113.08 yen to usd
	public int toYen(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*111.83;
		}
		if(unit == "EURO") {
			currency=currency/.86;
			currency=currency*111.83;
		}
		if(unit == "POUND") {
			currency=currency/.76;
			currency=currency*111.83;
		}
		if(unit=="YEN") {
			currency=currency;
		}
		if(unit=="PESO") {
			currency=currency/18.79;
			currency=currency*111.83;
		}
		if(unit=="CSD") {
			currency=currency/1.282;
			currency=currency*111.83;
		}
		return (int)currency;
	}
	//20.24 peso to usd
	public double toPeso(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*18.79;
		}
		if(unit == "EURO") {
			currency=currency/.86;
			currency=currency*18.79;
		}
		if(unit == "POUND") {
			currency=currency/.76;
			currency=currency*18.79;
		}
		if(unit=="YEN") {
			currency=currency/111.83;
			currency=currency*18.79;
		}
		if(unit=="PESO") {
			currency=currency;
		}
		if(unit=="CSD") {
			currency=currency/1.282;
			currency=currency*18.79;
		}
		return currency;
	}
	//1.325 rate usd to cad
	public static double toCanadian(double currency, String unit) {
		if(unit == "USD") {
			currency=currency*1.325;
		}
		if(unit == "EURO") {
			currency=currency/.86;
			currency=currency*1.282;
		}
		if(unit == "POUND") {
			currency=currency/.76;
			currency=currency*1.282;
		}
		if(unit=="YEN") {
			currency=currency/111.83;
			currency=currency*1.325;
		}
		if(unit=="PESO") {
			currency=currency/18.79;
			currency=currency*1.282;
		}
		if(unit=="CSD") {
			currency=currency;
		}
		return currency;
	}
}
