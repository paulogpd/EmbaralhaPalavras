import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		
		FabricaMecanicaDoJogo jogo = new FabricaMecanicaDoJogo();
		Scanner ler = new Scanner(System.in);
		int op;
		String resposta;
				
		System.out.println("Jogo embaralhador de palavras");
		System.out.println("Você deve adivinhar a palavra embaralhada");
		System.out.println("------------------------------------------");
		System.out.println("Qual tipo de jogo você quer?");
		System.out.println("1 - Morte subita - Você não pode errar.");
		System.out.println("2 - Infinito - Não para até você digitar SAIR para sair do jogo");
		op = ler.nextInt();
		
		if (op == 1) {
			do {
				System.out.println("Palavra embaralhada:");
				System.out.println(jogo.getEmbaralhada());
				System.out.println("Que palavra é essa?");
				resposta = ler.next();
				jogo.pegaResposta(resposta).toLowerCase();
				jogo.tipoDeJogo(op);
			} while (!(jogo.pegaMorteSubita() == true));	
		}
		
		if (op == 2) {
			do {
				System.out.println("Palavra embaralhada:");
				System.out.println(jogo.getEmbaralhada());
				System.out.println("Que palavra é essa?");
				resposta = ler.next();
				jogo.pegaResposta(resposta).toLowerCase();
				jogo.tipoDeJogo(op);
			} while (!(resposta.equals("sair")));
		}
		
		System.out.println("Pontuação: "+jogo.getPontucao());
		ler.close();
	}
}