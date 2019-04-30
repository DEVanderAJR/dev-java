import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket conexao = new Socket("localhost", 4000);

			BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
			PrintStream saida = new PrintStream(conexao.getOutputStream());

			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.print("> ");
				String linha = teclado.readLine();
				saida.println("Cliente diz: " + linha);

				String linha2 = entrada.readLine();
				System.out.println(linha2);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
