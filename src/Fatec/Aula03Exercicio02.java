package Fatec;

import javax.swing.JOptionPane;

public class Aula03Exercicio02 {
	public static void main(String[] args) {
		int num1, num2, maior, menor, soma;
		soma = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
		if (num1 < num2) {
			menor = num1;
			maior = num2;
		} else {
			menor = num2;
			maior = num1;
		}
		while (menor <= maior) {
			if (menor % 2 != 0) {
				soma += menor;
			}
			menor++;
		}
		System.out.println(soma);
	}
}
