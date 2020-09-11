package Fatec;

import javax.swing.JOptionPane;

public class FatexEx5 {

	public static void main(String[] args) {
		int quantHorasTrabalhadas;
		double valorHora;
		double percDesconto;
		int numDescendentes;
		double salarioBruto, salarioLiquido;
		
		quantHorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas "));
		valorHora = Integer.parseInt(JOptionPane.showInputDialog("Valor da hora"));
		percDesconto = Integer.parseInt(JOptionPane.showInputDialog("Percentual de desconto"));
		numDescendentes = Integer.parseInt(JOptionPane.showInputDialog("Numero de descendentes"));
		
		salarioBruto = valorHora * quantHorasTrabalhadas;
		salarioLiquido =  (salarioBruto - (salarioBruto * (percDesconto/100)))+(numDescendentes * 100);
		
		JOptionPane.showMessageDialog(null, "O salario final é de : " + salarioLiquido);
		
		
		
	}

}
