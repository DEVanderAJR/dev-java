import java.util.Scanner;


public class exe10 {

	public static boolean imppar(int a){
		if (a % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um inteiro\n");
		num = entra.nextInt();
		
		if(imppar(num)){
			System.out.println("par");
		}
		else{
			System.out.println("impar");
		}

	}

}
