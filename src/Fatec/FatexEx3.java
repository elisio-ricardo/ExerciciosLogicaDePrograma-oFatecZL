package Fatec;

import javax.swing.JOptionPane;

public class FatexEx3 {

	public static void main(String[] args) {
		int x, y, z;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
		z = x;
		x = y;
		y = z;
		
		JOptionPane.showInternalMessageDialog(null, "Foi efetuado a troca, os valores de x é " + x + " e de y é " + y);
	}

}
