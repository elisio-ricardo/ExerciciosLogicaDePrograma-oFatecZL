package Fatec.Aula10ClasseAbstrata;

 class Estatistica {

	int codigoCidade;
	int qtdAcidentes;
	String nomeCidade;

	Estatistica() {
		this(0, "", 0);
	}

	Estatistica(int codigoCidade2, String nomeCidade2, int qtdAcidentes2) {

		codigoCidade = codigoCidade2;
		qtdAcidentes = qtdAcidentes2;
		nomeCidade = nomeCidade2;
	}

}
