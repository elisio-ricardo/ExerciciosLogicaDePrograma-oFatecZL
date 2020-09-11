package Fatec;

import javax.swing.JOptionPane;

public class Lt01EstEncadeada18ex {

	public static void main(String[] args) {
		int n1, n2, res;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("1° valor: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("2° Valor: "));
		
		if(n1 > n2 ) {
			res = n1 - n2;
			System.out.println("A diferença dos valores N1 = " + n1 + 
					" e N2 = " + n2 + " é " + res);
		}else {
			res = n2 - n1;
			System.out.println("A diferença dos valores N2 = " + n2 +
					" e N1 = " + n1 + " é " + res);
		}
	}
}
