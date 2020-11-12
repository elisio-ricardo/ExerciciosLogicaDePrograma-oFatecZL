package Fatec.Aula11;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws IOException  {

		Votacao[] cadastro = new Votacao[100];
		Votacao2020 v = new Votacao2020();

		for (int i = 0; i < cadastro.length; i++) {	cadastro[i] = new Votacao(); }

		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("MENU VOTAÇÃO \n 1 - Carregar Seção/Numero Eleitor \n 2 - Classificar por Seção \n"
							+ " 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar "));
			switch (opc) {
			case 1:
				cadastro = v.FCADRASTRAVOTACAO(cadastro);
				break;
			case 2:
				cadastro = v.FCLASSIFICASECAO(cadastro);
				break;				
			case 3:
				cadastro = v.FGRAVAVOTAÇÃO(cadastro);
				break;
			case 4:
				int opc2 = 0;
				while (opc2 != 9) {
					opc2 = Integer.parseInt(
							JOptionPane.showInputDialog("MOSTRAR INDICADORES \n ESTATISTICAS DE VOTAÇÃO EM 2020 \n"
									+ " 1 - Quantidade de Eleitores por seção \n 2 - Seção com Maior e Menor numero de Eleitores \n 3 - Quantidade de votos por Candidatos \n"
									+ " 4 - 10 Primeiros colocados (Nro.Candidatos e qtd. Votos) \n 9 - Finaliza Consulta"));
					switch (opc2) {
					case 1:
						v.QTDEleitoresSecao(cadastro);
						break;
					case 2:
						v.SecaoMaiorMenor(cadastro);
						break;
					case 3:
						v.QTdVotosCandidatos(cadastro);
						break;
					case 4:
						v.DezPrimeirosColocados(cadastro);
						break;
					case 9:
						JOptionPane.showMessageDialog(null, "Finalizando Consulta");
						break;
					default:
						JOptionPane.showMessageDialog(null, "NUMERO INVALIDO !!");
					}
				}
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando Programa");
				break;

			default:
				JOptionPane.showMessageDialog(null, "NUMERO INVALIDO !!");

			}
		}
	}
}
