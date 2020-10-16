package Fatec;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	public double[][] carregaNotas(double z[][]) {

		for (int i = 0; i < z.length; i++) {

			JOptionPane.showMessageDialog(null, "Digite a nota do aluno " + (i + 1));
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a " + (j + 1) + "° Nota"));
			}
		}
		return z;
	}

	public double[] calculaMedia(double z[][]) {
		
		double[] t = new double[z.length];
		for (int i = 0; i < z.length; i++) {
			double media = 0;
			for (int j = 0; j < z[i].length; j++) {

				media = media + z[i][j];
			}
			t[i] = (media / z[0].length);
		}
		return t;
	}

	public void mostrarMedia(double mediaAlunos[]) {

		for (int i = 0; i < mediaAlunos.length; i++) {
			JOptionPane.showMessageDialog(null, "A media das notas do aluno " + (i + 1) + " foi " + (mediaAlunos[i]));
		}

	}

}
