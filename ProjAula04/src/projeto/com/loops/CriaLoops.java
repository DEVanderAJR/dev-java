package projeto.com.loops;
import java.util.Scanner;

public class CriaLoops {

	public static void main(String[] args) {
		// exemplos de laços de repetição.
		
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
		double control = 0;
		double inicio = 0;
		double fim = 0;
		
		
		do {
			
		System.out.println("Digite valor para repetição: ");		
		control = Double.valueOf(n2.nextLine());
			
		System.out.println("Exemplo de While");
		System.out.println("Exemplo de do While");
		
		inicio = control;
		//While
		while(control != 0) {

				System.out.println("Exemplo de While: " + control);
				control--;
		}
		
		control = inicio;
		
				
		for(int x=0;x < control;x++) {
			
			System.out.println("Exemplo de for: "+ x);
			
		}
		
		System.out.println(" digite  0 para sair: ");		
		control = Double.valueOf(n1.nextLine());
		
		}while(control != 0);
	}

}
