package Fatec;

import javax.swing.JOptionPane;

public class Tarefa2Ex3 {

	public static void main(String[] args) {
		int cod;
		double sal, aumento;
		
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo: \n1-Escrituário \n2-Secretário \n3-Caixa \n4-Gerente"));
		sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salario: "));
		
		switch (cod) {
		case 1: {
			aumento = sal * 0.5;
			System.out.println("O cargo é de Escrituário e terá um aumento de " + aumento +" do seu salário de R$" + sal );			
			break;
		}case 2: {
			aumento = sal * 0.35;
			System.out.println("O cargo é de Secretário e terá um aumento de " + aumento +" do seu salário de R$" + sal );			
			break;
		}case 3: {
			aumento = sal * 0.2;
			System.out.println("O cargo é de Caixa e terá um aumento de " + aumento +" do seu salário de R$" + sal );			
			break;
		}case 4: {
			aumento = sal * 0.5;
			System.out.println("O cargo é de Gerente e terá um aumento de " + aumento +" do seu salário de R$" + sal );			
			break;
		}		
		default:
			System.out.println("Não a cargo para esta opção");
		}
	}

}
