package Fatec;

import javax.swing.JOptionPane;

public class Aula05Ex01ex35 {

	public static void main(String[] args) {

		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		JOptionPane.showMessageDialog(null, "O valor da soma dos impares foi : " + SomaImpares(num1, num2));

	}

	private static int SomaImpares(int num1, int num2) {
		int maior, menor;
		int soma = 0;
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		while (menor <= maior) {
			if (menor % 2 != 0) {
				soma += menor;
			}
			menor++;
		}
		return soma;
	}

}
