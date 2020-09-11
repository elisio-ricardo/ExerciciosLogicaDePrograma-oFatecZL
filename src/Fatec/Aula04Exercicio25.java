package Fatec;

import javax.swing.JOptionPane;

public class Aula04Exercicio25 {
	static int hI, hF, mI, mF;

	public static void main(String[] args) {

		hI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo : "));
		mI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo: "));
		hF = Integer.parseInt(JOptionPane.showInputDialog("Digite o horario final do jogo: "));
		mF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo: "));

		calcHora();
	}

	private static void calcHora() {

		int hT, resM;

		if (hF > hI) {
			if ((mI + mF) > 60) {
				hT = (hF - hI) + 1;
				resM = (mI + mF) - 60;
			} else {
				hT = (hF - hI);
				resM = mI + mF;
			}
		} else {
			if ((mI + mF) > 60) {
				hT = (24 - hI) - hF + 1;
				resM = (mI + mF) - 60;
			} else {
				hT = (24 + hI) - hF;
				resM = mI + mF;
			}
		}
		System.out.println("O horario total do jogo foi " + hT + " : " + resM);

	}

}
