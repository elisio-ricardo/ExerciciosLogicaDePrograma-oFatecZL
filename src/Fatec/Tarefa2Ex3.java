package Fatec;

import javax.swing.JOptionPane;

public class Tarefa2Ex3 {

	public static void main(String[] args) {
		int cod;
		double sal, aumento;
		
		cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do cargo: \n1-Escritu�rio \n2-Secret�rio \n3-Caixa \n4-Gerente"));
		sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salario: "));
		
		switch (cod) {
		case 1: {
			aumento = sal * 0.5;
			System.out.println("O cargo � de Escritu�rio e ter� um aumento de " + aumento +" do seu sal�rio de R$" + sal );			
			break;
		}case 2: {
			aumento = sal * 0.35;
			System.out.println("O cargo � de Secret�rio e ter� um aumento de " + aumento +" do seu sal�rio de R$" + sal );			
			break;
		}case 3: {
			aumento = sal * 0.2;
			System.out.println("O cargo � de Caixa e ter� um aumento de " + aumento +" do seu sal�rio de R$" + sal );			
			break;
		}case 4: {
			aumento = sal * 0.5;
			System.out.println("O cargo � de Gerente e ter� um aumento de " + aumento +" do seu sal�rio de R$" + sal );			
			break;
		}		
		default:
			System.out.println("N�o a cargo para esta op��o");
		}
	}

}
