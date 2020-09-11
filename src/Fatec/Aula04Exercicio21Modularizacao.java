package Fatec;

import javax.swing.JOptionPane;

public class Aula04Exercicio21Modularizacao {

	public static void main(String[] args) {
		double n1, n2, n3, n4;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("1° Nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("2° nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("3° Nota: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("4° Nota: "));

		CalcMedia(n1, n2, n3, n4);

	}

	private static void CalcMedia(double n1, double n2, double n3, double n4) {

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 6.0) {
			System.out.println("APROVADO");
		} else if (media >= 3.0) {
			System.out.println("EXAME");
		} else {
			System.out.println("RETIDO");
		}
	}

}
