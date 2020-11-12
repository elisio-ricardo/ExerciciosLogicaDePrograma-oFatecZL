package Fatec.Aula10ClasseAbstrata;

import javax.swing.JOptionPane;

public  class ClasseMetodos {

	public Estatistica[] FcadastraEstatistica(Estatistica[] estatistica) {
		for (int i = 0; i < estatistica.length; i++) {
			estatistica[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Cidade "));
			estatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da Cidade");
			estatistica[i].qtdAcidentes = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Acidentes "));
		}
		return estatistica;
	}

	public void PQtdAcidentes(Estatistica[] estatisticas) {

		for (int i = 0; i < estatisticas.length; i++) {
			if (estatisticas[i].qtdAcidentes > 100 && estatisticas[i].qtdAcidentes < 500) {
				System.out.println("Codigo " + estatisticas[i].codigoCidade + "- cidade " + estatisticas[i].nomeCidade
						+ " - numero de acidentes " + estatisticas[i].qtdAcidentes);
			}
		}

	}

	public void PMaiorMenor(Estatistica[] v) {
		int vQtd[] = new int[v.length];
		String vNome[] = new String[v.length];
		int aux = 0;
		String auxNome = "";
		for (int i = 0; i < v.length; i++) {
			vQtd[i] = v[i].qtdAcidentes;
			vNome[i] = v[i].nomeCidade;
		}

		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {			
						if (vQtd[i] > vQtd[j]) {
							aux = vQtd[i];
							vQtd[i] = vQtd[j];
							vQtd[j] = aux;

							auxNome = vNome[i];
							vNome[i] = vNome[j];
							vNome[j] = auxNome;
				}
			}
		}
		
		System.out.println("O menor numero de acidentes foi na cidade " + vNome[0] + " com " + vQtd[0]
				+ " Acidentes" + "\nO maior numero de acidentes foi na cidade de " + vNome[9]
				+ " com " + vQtd[9]);
	}

	public void PAcima(Estatistica[] v) {
		int soma = 0, media;

		for (int i = 0; i < v.length; i++) {
			soma += v[i].qtdAcidentes;
		}

		media = (soma / v.length);
		System.out.println("A media de acidentes foi " + media);

		for (int i = 0; i < v.length; i++) {
			if (v[i].qtdAcidentes > media) {
				System.out.println("A cidade " + v[i].nomeCidade + " tem uma quantidade de acidentes acima da media "
						+ " com " + v[i].qtdAcidentes + " Acidentes");
			}
		}

	}

}
