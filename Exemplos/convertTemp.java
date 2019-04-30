import java.util.Scanner;


public class exe11 {

	public static void celkf(float c){
		double kelvin = c + 273.15;
		System.out.println("Temperatura em kelvin: "+kelvin);
		double far = (c*1.8)+32;
		System.out.println("Temperatura em fahrenheit: "+far);	
	}
	
	public static void main(String[] args) {
		Scanner entra = new Scanner (System.in);
		float temp;
		System.out.println("Convertendo temperaturas");
		System.out.println("Informe a temperatura em Celcius");
		temp = entra.nextFloat();
		celkf(temp);
	}

}
