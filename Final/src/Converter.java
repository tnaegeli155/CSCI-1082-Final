import java.util.Scanner;
public class Converter {	

	private static double obj = 675.89;
	private static int obj2 = 85;
	private static int obj3 = 4;
	private static double obj4 = 278.49;
	private static double obj5 = 1000;
	private static String unit = "YEN";
	public static void main(String[] args) {

		System.out.println(obj+" Grams is "+Mass.toLbs(obj));
		
		System.out.println(obj2+"oz is "+Mass.toLbs(obj2));
		
		System.out.println(obj3+"Lbs is "+(int)Mass.toOz(obj3,0)+" Oz");
		
		System.out.printf(obj4+" Grams is %.2f Oz", Mass.toOz(obj4));
		
		System.out.println("\n$"+obj5+" is "+Currency.toCanadian(obj5, unit)+" Canadian Dollars");
	}
}
