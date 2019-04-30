import javax.swing.JOptionPane;
public class comanda {
	
	public static void main(String[] args) {
		Boteco c = new Boteco();
		c.setdia(JOptionPane.showInputDialog(null,"Informe o dia da semana:\n(1) Dom | Seg  | Ter | Quar \n(2) Qui | Sex | Sab: "));
		c.setmesa(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero da mesa do cliente:")));
		c.setchegada(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a hora da entrada 1hs a 24hs: ")));
		c.setsaida(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a hora da Saída 1hs a 24hs: ")));
		c.setcerveja(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de Cerveja: ")));
		c.setrefri(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de refrigerantes pedidos: ")));
		c.setporcao(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de porcoes pedidas: ")));
		c.setcaldos(Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de caldos pedidos: ")));
		c.setgarcom(JOptionPane.showInputDialog(null,"Selecione o funcionário (1) GARÇOM”  \n ”(2) TRAINEES: "));
		JOptionPane.showMessageDialog(null,"V1 sem comissão 10%: " + c.getv2()+"\n"  
				           		      + "Valor a pagar ao funcionario: " + c.getmostrarcomissao()+ "\n"
				                      + "Valor de Conver: " + c.getcouver()+"\n" 
				                      + "Comissão 10%: " + c.getcomissao10() + "\n"
				                      + "Dinheiro a receber: "+ c.getv1() + "\n " );
	}
}
