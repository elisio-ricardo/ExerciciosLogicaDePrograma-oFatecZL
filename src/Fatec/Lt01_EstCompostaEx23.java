package Fatec;

import javax.swing.JOptionPane;

public class Lt01_EstCompostaEx23 {

	public static void main(String[] args) {
		int n1, n2, n3, n4;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero(maior que o primeiro): "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° numero(maior que o segundo): "));
		n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° numero(qualquer ordem): "));
		
		if (n4 < n1) {
			System.out.println("A ordem dos valores é " +n4+"-"+n1+"-"+n2+"-"+n3);
		}else if (n1 < n4 && n4 < n2) {
			System.out.println("A ordem dos valores é " +n1+"-"+ n4+"-"+n2+"-"+n3);
		}else if(n2 < n4 && n4 < n3) {
			System.out.println("A ordem dos valores é " +n1+"-"+ n2+"-"+n4+"-"+n3);
		}else {
			System.out.println("A ordem dos numeros é " +n1+"-"+n2+"-"+ n3+"-"+n4);
		}
	}
}
