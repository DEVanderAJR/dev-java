package Hotel;

import java.util.Scanner;

public class Main {

    int opcaoMenu;
    static boolean menu=true;
    
public static void main(String[] args)
    {
        
        Quarto Locatario = new Quarto();
        DataHora dataEntrada = new DataHora();
	DataHora dataSaida = new DataHora();
        Scanner scan = new Scanner(System.in);

        while(menu){

        System.out.println("1. Inserir Hospede.");
        System.out.println("2. Retirar Hospede.");
        System.out.println("3. Atualizar Valor da Diaria.");
        System.out.println("4. Sair.");
        int opcaoMenu = scan.nextInt();

        switch(opcaoMenu)
        {

            case 1:
                scan.nextLine();
                System.out.println("Nome Locatario: ");
                Locatario.nomeLocatario = scan.nextLine();
                System.out.println("Numero de Pessoas: ");
                Locatario.numerodePessoas = scan.nextInt();
                System.out.println("Data Entrada: ");
                System.out.println("Dia:");
                dataEntrada.dia = scan.nextInt();
                System.out.println("Mes:");
                dataEntrada.mes = scan.nextInt();
                System.out.println("Ano:");
                dataEntrada.ano = scan.nextInt();
                System.out.print("Hora Entrada");
                System.out.println("Hora:");
                dataEntrada.hora = scan.nextInt();
                System.out.println("Minuto:");
                dataEntrada.minuto = scan.nextInt();
                System.out.println("Segundo");
                dataEntrada.segundo = scan.nextInt();
                break;
            case 2:
                System.out.println("Data Saida: ");
                System.out.println("Dia:");
                dataSaida.dia = scan.nextInt();
                System.out.println("Mes:");
                dataSaida.mes = scan.nextInt();
                System.out.println("Ano:");
                dataSaida.ano = scan.nextInt();
                System.out.print("Hora Saida");
                System.out.println("Hora:");
                dataSaida.hora = scan.nextInt();
                System.out.println("Minuto:");
                dataSaida.minuto = scan.nextInt();
                System.out.println("Segundo:");
                dataSaida.segundo = scan.nextInt();
                System.out.print("\n");
                System.out.println("Locatario: " +Locatario.nomeLocatario);
                System.out.println("Numero de Pessoas: " +Locatario.numerodePessoas);
                System.out.println("Data e Hora Entrada :" +dataEntrada.paraString());
                System.out.println("Data e Hora Saida: " +dataSaida.paraString());
                Locatario.valorDevido = DataHora.diferenca(dataEntrada, dataSaida)*Locatario.valorDiaria;
                System.out.println("Dias: " +DataHora.diferenca(dataEntrada, dataSaida));
                System.out.println("Valor Devido: R$" +Locatario.valorDevido);
                break;
            case 3:
                System.out.println("Valor da Diaria: ");
                Locatario.valorDiaria = scan.nextFloat();
                break;
            case 4:
                menu=false;
                break;

        }
        }
        }
}
