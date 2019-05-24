package com.aulajava.heranca;

public class Heranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Veiculos Aero*/
		Helicoptero Peloar = new Helicoptero();		
		System.out.println("\n------------------- Ve�culo: "+Peloar.GetTipo()+"-----------------------");
		
		
			Peloar.ChecarSeguranca();
			Peloar.SetQtdHelices(8);
			System.out.println("\nTipo de ve�culo: "+Peloar.GetTipo()+"\nCor do ve�culo: "+Peloar.GetCor() +"\nQtd de passageiros: "+Peloar.GetQtdTripulantes()+"\nTotal de Helices do ve�culo: "+Peloar.GetQtdHelices());
			Peloar.SetAlturaMaxVoo(2000.00);
			Peloar.SetAlturaMinVoo(500.00);
			System.out.println("Altura M�xima permitida para o ve�culo: "+ Peloar.GetTipo()+" - "+Peloar.GetAlturaMaxVoo()+" mil metros.\n"
					+ "Altura M�nma permitida para o ve�culo: "+ Peloar.GetTipo()+" - "+Peloar.GetAlturaMinVoo()+" metros.");
			Peloar.Voar();
			Peloar.Pousar();
			Peloar.Abastecer();
			Peloar.ChecarSeguranca();
		System.out.println("\n--------------------------Fim processamento Ve�culo: "+Peloar.GetTipo()+"-----------------------------\n");
		
		/*Ve�culo Terrestre
		 * */
		Carro PeloChao = new Carro();
		System.out.println("\n------------------- Ve�culo: "+PeloChao.GetTipo()+"-----------------------");
		
			PeloChao.SetQtdRodas(4);
			PeloChao.SetTecnologiaCambio("Autom�tico");
			PeloChao.SetTipoMotor("Tunning.");
			PeloChao.SetTipoTracao("4x4");
			System.out.println("Tipo de ve�culo: "+ PeloChao.GetTipo()+"\nCor do ve�culo: "+PeloChao.GetCor()+""
					+ "\n Qtd de Passageiros: "+PeloChao.GetQtdTripulantes()+"\nTotal de rodas: "+PeloChao.GetQtdRodas()
					+ "\n Tipo de Cambio: "+ PeloChao.GetTecnologiaCambio()+"\nTipo do Motor: "+PeloChao.GetTipoMotor()
					+ "\n Tipo de Tra��o do Ve�culo: "+PeloChao.GetTipoTracao());
			PeloChao.ChecarSeguranca();
			PeloChao.Abastecer();System.out.println(PeloChao.GetTipoCombustivel());
			PeloChao.Arrancar();System.out.println(PeloChao.GetVelocidadeHora()+" KM hora.");
			PeloChao.Estacionar();
		System.out.println("\n--------------------------Fim processamento Ve�culo: "+PeloChao.GetTipo()+"-----------------------------\n");
		
		
		/*Veiculo Maritimo
		 */
		 Submarino PelaAgua = new Submarino();
		 System.out.println("\n------------------- Ve�culo: "+PelaAgua.GetTipo()+"-----------------------");
			
		 
		 PelaAgua.Submergir();
		 PelaAgua.Emergir();
		 
		 System.out.println("\n--------------------------Fim processamento Ve�culo: "+PelaAgua.GetTipo()+"-----------------------------\n");
					
	}

}
