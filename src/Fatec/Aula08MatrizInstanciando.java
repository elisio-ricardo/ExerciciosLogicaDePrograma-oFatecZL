package Fatec;

import javax.swing.JOptionPane;

public class Aula08MatrizInstanciando {

	public static void main(String[] args) {

		double notasAlunos[][] = new double[3][2];
		double mediaAlunos[] = new double[notasAlunos[0].length];
		int opc = 0;

		ClasseMetodos a = new ClasseMetodos();

		do {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("1 – Carrega notas \n2 – Calcula Média \n3 – Mostra Média \n9 - Fim"));

			switch (opc) {

			case 1:
				notasAlunos = a.carregaNotas(notasAlunos);
				break;
			case 2:
				mediaAlunos = a.calculaMedia(notasAlunos);
				break;
			case 3:
				a.mostrarMedia(mediaAlunos);
				break;
			case 9:
				JOptionPane.showConfirmDialog(null, "Finalizando");
				break;
			default:
				JOptionPane.showConfirmDialog(null, "opc INVALIDO");
			}
		} while (opc != 9);

	}
}



