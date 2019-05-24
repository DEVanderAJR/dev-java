package com.aulajava.heranca;

public class Heranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Veiculos Aero*/
		Helicoptero Peloar = new Helicoptero();		
		System.out.println("\n------------------- Veículo: "+Peloar.GetTipo()+"-----------------------");
		
		
			Peloar.ChecarSeguranca();
			Peloar.SetQtdHelices(8);
			System.out.println("\nTipo de veículo: "+Peloar.GetTipo()+"\nCor do veículo: "+Peloar.GetCor() +"\nQtd de passageiros: "+Peloar.GetQtdTripulantes()+"\nTotal de Helices do veículo: "+Peloar.GetQtdHelices());
			Peloar.SetAlturaMaxVoo(2000.00);
			Peloar.SetAlturaMinVoo(500.00);
			System.out.println("Altura Máxima permitida para o veículo: "+ Peloar.GetTipo()+" - "+Peloar.GetAlturaMaxVoo()+" mil metros.\n"
					+ "Altura Mínma permitida para o veículo: "+ Peloar.GetTipo()+" - "+Peloar.GetAlturaMinVoo()+" metros.");
			Peloar.Voar();
			Peloar.Pousar();
			Peloar.Abastecer();
			Peloar.ChecarSeguranca();
		System.out.println("\n--------------------------Fim processamento Veículo: "+Peloar.GetTipo()+"-----------------------------\n");
		
		/*Veículo Terrestre
		 * */
		Carro PeloChao = new Carro();
		System.out.println("\n------------------- Veículo: "+PeloChao.GetTipo()+"-----------------------");
		
			PeloChao.SetQtdRodas(4);
			PeloChao.SetTecnologiaCambio("Automático");
			PeloChao.SetTipoMotor("Tunning.");
			PeloChao.SetTipoTracao("4x4");
			System.out.println("Tipo de veículo: "+ PeloChao.GetTipo()+"\nCor do veículo: "+PeloChao.GetCor()+""
					+ "\n Qtd de Passageiros: "+PeloChao.GetQtdTripulantes()+"\nTotal de rodas: "+PeloChao.GetQtdRodas()
					+ "\n Tipo de Cambio: "+ PeloChao.GetTecnologiaCambio()+"\nTipo do Motor: "+PeloChao.GetTipoMotor()
					+ "\n Tipo de Tração do Veículo: "+PeloChao.GetTipoTracao());
			PeloChao.ChecarSeguranca();
			PeloChao.Abastecer();System.out.println(PeloChao.GetTipoCombustivel());
			PeloChao.Arrancar();System.out.println(PeloChao.GetVelocidadeHora()+" KM hora.");
			PeloChao.Estacionar();
		System.out.println("\n--------------------------Fim processamento Veículo: "+PeloChao.GetTipo()+"-----------------------------\n");
		
		
		/*Veiculo Maritimo
		 */
		 Submarino PelaAgua = new Submarino();
		 System.out.println("\n------------------- Veículo: "+PelaAgua.GetTipo()+"-----------------------");
			
		 
		 PelaAgua.Submergir();
		 PelaAgua.Emergir();
		 
		 System.out.println("\n--------------------------Fim processamento Veículo: "+PelaAgua.GetTipo()+"-----------------------------\n");
					
	}

}
