package Fatec.Aula10ClasseAbstrata;

import javax.swing.JOptionPane;

public class Aula10AbstrataProcedimentoFuncao {

	public static void main(String[] args) {

		Estatistica[] estatistica = new Estatistica[10];

		ClasseMetodos m = new ClasseMetodos();

		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i] = new Estatistica();
		}

		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATISTICAS \n Estatisticas de Acidentes de 2020"
					+ " \n 1 - Cadastro de Estatisticas \n 2- Consulta por quantidade de Acidentes \n 3- Consulta por Estatisticas de Acidentes"
					+ "\n 4 - Acidentes Acima da Media das 10 Cidades \n 9 - Finaliza"));
			switch (opc) {
			case 1:
				estatistica = m.FcadastraEstatistica(estatistica);
				break;
			case 2:
				m.PQtdAcidentes(estatistica);
				break;
			case 3:
				m.PMaiorMenor(estatistica);
				break;
			case 4:
				m.PAcima(estatistica);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando Programa");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção invalida !");
			}
		}

	}

}
