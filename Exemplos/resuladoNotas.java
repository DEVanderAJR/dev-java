import java.util.Scanner;


public class exe9 {

	public static boolean teste(float nota1, float nota2){
		boolean resultado;
		float media;
		media = (nota1+nota2)/2;
		if(media>=5)
			resultado=true;
		else
			resultado=false;
		return resultado;
		
	}
	
	public static void main(String[] args) {
		Scanner entr = new Scanner(System.in);
		float nota1, nota2;
		System.out.println("Digite a nota 1");
		nota1 = entr.nextFloat();
		System.out.println("Digite a nota 2");
		nota2 = entr.nextFloat();
		
		if (teste(nota1,nota2)){
			System.out.println("Aprovado");
		}
		else{
			System.out.println("Reprovado");
		}
	}

}
