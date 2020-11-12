package Fatec.Aula11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Votacao2020 {

	public Votacao[] FCADRASTRAVOTACAO(Votacao[] c) {

		for (int i = 0; i < 100; i++) {
			c[i].numeroCandidato = (int) ((Math.random() * 299) + 1);
			c[i].numeroSecao = (int) ((Math.random() * 10));
		}
		return c;
	}

	public Votacao[] FCLASSIFICASECAO(Votacao[] c) {
		
		int aux = 0;
		int auxSecao = 0;
		for (int i = 0; i < c.length; i++) {
			c[i].numeroCandidato = c[i].numeroCandidato;
			c[i].numeroSecao = c[i].numeroSecao;
		}

		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].numeroSecao > c[j].numeroSecao) {
					aux = c[i].numeroSecao;
					c[i].numeroSecao = c[j].numeroSecao;
					c[j].numeroSecao = aux;

					auxSecao = c[i].numeroCandidato;
					c[i].numeroCandidato = c[j].numeroCandidato;
					c[j].numeroCandidato = auxSecao;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Dados Classificados");
		return c;
	}

	public Votacao[] FGRAVAVOTAÇÃO(Votacao[] c) throws IOException {
		
		String fileName = "Votacao2020.txt";

		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));

		for (int i = 0; i < c.length; i++) {

			gravar.write(Integer.toString(c[i].numeroSecao));
			gravar.newLine();
			gravar.write(Integer.toString(c[i].numeroCandidato));
			gravar.newLine();
		}
		JOptionPane.showMessageDialog(null, "Arquivo Gerado");
		gravar.close();
		return c;
	}

	public void QTDEleitoresSecao(Votacao[] c) throws IOException {

		int secao[] = new int[10];
		String fileName = "Votacao2020.txt";
		BufferedReader ler = new BufferedReader(new FileReader(fileName));

		for (int i = 0; i < 100; i++) {
			c[i].numeroSecao = Integer.parseInt(ler.readLine());
			c[i].numeroCandidato = Integer.parseInt(ler.readLine());

			for (int j = 0; j < 10; j++) {
				if (c[i].numeroSecao == j) {
					secao[j] += 1;
				}

			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("A seção numero " + (i + 1) + " teve " + (secao[i]) + " votos");
		}
		ler.close();
		System.out.println("################################################");
	}

	public void SecaoMaiorMenor(Votacao[] c) throws IOException {
		Votacao[] ma = new Votacao[10];
		for (int i = 0; i < ma.length; i++) {
			ma[i] = new Votacao();
		}
		int aux2 = 0;

		String fileName = "Votacao2020.txt";
		BufferedReader ler = new BufferedReader(new FileReader(fileName));

		for (int i = 0; i < 100; i++) {
			c[i].numeroSecao = Integer.parseInt(ler.readLine());
			c[i].numeroCandidato = Integer.parseInt(ler.readLine());

			for (int j = 0; j < 10; j++) {
				if (c[i].numeroSecao == j) {
					ma[j].numeroCandidato += 1;
					ma[j].numeroSecao = j;
				}
			}
		}
		int aux = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (ma[i].numeroCandidato > ma[j].numeroCandidato) {
					aux = ma[i].numeroCandidato;
					ma[i].numeroCandidato = ma[j].numeroCandidato;
					ma[j].numeroCandidato = aux;

					aux2 = ma[i].numeroSecao;
					ma[i].numeroSecao = ma[j].numeroSecao;
					ma[j].numeroSecao = aux2;
				}
			}

		}
		ler.close();
		System.out.println("A seção com o maior numero de votos foi " + (ma[9].numeroSecao + 1) + " com "
				+ ma[9].numeroCandidato + " votos \n" + "A seção com o menor numero de votos foi "
				+ (ma[0].numeroSecao + 1) + " com " + ma[0].numeroCandidato + " votos ");
		System.out.println("##################################################");
	}

	public void QTdVotosCandidatos(Votacao[] c) {

		Votacao[] qtdVotos = new Votacao[c.length];
		Votacao[] qtd = new Votacao[c.length];

		for (int i = 0; i < c.length; i++) {
			qtdVotos[i] = new Votacao();
			qtd[i] = new Votacao();
			qtd[i].numeroCandidato = c[i].numeroCandidato;
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (c[i].numeroCandidato == qtd[j].numeroCandidato) {
					qtdVotos[i].numeroCandidato = c[i].numeroCandidato;
					qtdVotos[i].numeroSecao += 1;
					qtd[j].numeroCandidato = 0;
				}
			}
		}

		int aux, aux2 = 0;
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (qtdVotos[i].numeroCandidato > qtdVotos[j].numeroCandidato) {
					aux = qtdVotos[i].numeroCandidato;
					qtdVotos[i].numeroCandidato = qtdVotos[j].numeroCandidato;
					qtdVotos[j].numeroCandidato = aux;

					aux2 = qtdVotos[i].numeroSecao;
					qtdVotos[i].numeroSecao = qtdVotos[j].numeroSecao;
					qtdVotos[j].numeroSecao = aux2;
				}
			}
		}

		int total = 0;
		for (int i = 0; i < 100; i++) {

			if (qtdVotos[i].numeroSecao != 0) {
				total += qtdVotos[i].numeroSecao;
				System.out.println(total + " O candidato " + qtdVotos[i].numeroCandidato + " teve "
						+ qtdVotos[i].numeroSecao + " votos");
			
			}
		}
		System.out.println("################################################");
	}

	public void DezPrimeirosColocados(Votacao[] c) {
		
		
		Votacao[] valor = new Votacao[c.length];
		Votacao[] qtd = new Votacao[c.length];

		for (int i = 0; i < c.length; i++) {
			valor[i] = new Votacao();
			qtd[i] = new Votacao();
			qtd[i].numeroCandidato = c[i].numeroCandidato;
			valor[i].numeroCandidato = c[i].numeroCandidato;
		}

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (c[i].numeroCandidato == qtd[j].numeroCandidato) {
					valor[i].numeroCandidato = c[i].numeroCandidato;
					valor[i].numeroSecao += 1;
					qtd[j].numeroCandidato = 0;
				}else {
					 
				}
			}
		}

		int aux, aux2 = 0;
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (valor[i].numeroSecao > valor[j].numeroSecao) {
					aux = valor[i].numeroSecao;
					valor[i].numeroSecao = valor[j].numeroSecao;
					valor[j].numeroSecao = aux;

					aux2 = valor[i].numeroCandidato;
					valor[i].numeroCandidato = valor[j].numeroCandidato;
					valor[j].numeroCandidato = aux2;
				}
			}
		}

		int total = 0;
		int i = c.length;

				while( i > 88) {
				total += valor[i].numeroSecao;
				System.out.println(total + " O candidato " + valor[i].numeroCandidato + " teve "
						+ valor[i].numeroSecao + " votos");
				i --;
				}
				System.out.println("################################################");
	}
}
