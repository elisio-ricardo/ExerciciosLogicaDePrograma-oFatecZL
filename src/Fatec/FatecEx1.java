package Fatec;

import javax.swing.JOptionPane;

public class FatecEx1 {
	public static void main(String[] args) {
		

	int  celsius, fahrenheit ; 
    celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em Celsius: ")); 
    
    fahrenheit = ((9*celsius + 160) / 5);
    JOptionPane.showMessageDialog(null,"A Temperatura em fahrenheit é : " + fahrenheit);

}
}
