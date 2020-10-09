package Fatec;

import javax.swing.JOptionPane;

public class Aula08Matriz {

	public static void main(String[] args) {
		
		double notasAlunos[][] = new double[3][2];
		double mediaAlunos[] = new double[notasAlunos.length];
		double mediaProva[] = new double[notasAlunos[0].length];

		for (int i = 0; i < notasAlunos.length; i++) {
			double media = 0;

			JOptionPane.showMessageDialog(null, "Digite a nota do aluno " + (i + 1));
			for (int j = 0; j < notasAlunos[i].length; j++) {
				notasAlunos[i][j] = Double
						.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + (j + 1) + "° Nota"));

				media = media + notasAlunos[i][j];
				
				mediaProva[j] = mediaProva[j] + notasAlunos[i][j];

			}
			mediaAlunos[i] = (media / notasAlunos[i].length);
		}

		for (int i = 0; i < notasAlunos.length; i++) {
			JOptionPane.showMessageDialog(null, "A media da nota do aluno " + (i + 1) + " foi " + (mediaAlunos[i]));
		}

		for (int i = 0; i < mediaProva.length; i++) {
			JOptionPane.showMessageDialog(null,
					"A media da prova" + (i + 1) + " foi " + ((mediaProva[i] / notasAlunos.length)));
		}
	}
}
