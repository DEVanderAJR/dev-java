public class arredondar {
	public static double roundDecimalPart(double number, int deep) {
		double multiplier = Math.pow(10, (double) deep);
		return (double) (Math.round(number * multiplier)) / multiplier;				
	}
}
