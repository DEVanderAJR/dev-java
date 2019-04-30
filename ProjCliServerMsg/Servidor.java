import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(4000);

			while (true) {
				System.out.println("Esperando conexão...");
				Socket conexao = s.accept();
				System.out.println("Conectou pelo socket " + conexao.getInetAddress() + ":" + conexao.getLocalPort());
				System.out.println();

				BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
				PrintStream saida = new PrintStream(conexao.getOutputStream());

				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

				while (true) {
					String linha = entrada.readLine();
					System.out.println(linha);

					System.out.print("> ");
					String linha2 = teclado.readLine();
					saida.println("Servidor diz: " + linha2);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
