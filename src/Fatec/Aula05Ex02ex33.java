package Fatec;

import javax.swing.JOptionPane;

public class Aula05Ex02ex33 {

	public static void main(String[] args) {

		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite  um numero: "));
		JOptionPane.showMessageDialog(null, "O resultado da soma das divisões é : " + SomaDivisoes(num));

	}

	private static double SomaDivisoes(int num) {
		double soma = 0;
		for (double i = 1; i <= num; i++) {
			soma += 1 / i;
		}
		return soma;
	}
}
