import javax.swing.*;

public class exe8 {

	public static void quadSoma(float a, float b, float c){
		float quadS;
		quadS = a+b+c;
		quadS = quadS*quadS;
		JOptionPane.showMessageDialog(null, "Quadrado da soma dos n�meros: "+quadS);
	}
	public static void main(String[] args) {
		float n1=2, n2=2, n3=2;
		JOptionPane.showMessageDialog(null, "Informe tr�s n�meros");
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"N�mero 1: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"N�mero 2: "));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"N�mero 3: "));
		
		quadSoma(n1, n2, n3);
		
		
	}

}
