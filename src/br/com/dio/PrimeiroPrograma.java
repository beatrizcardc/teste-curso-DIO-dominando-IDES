package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);

	}

}

/*
 * abrindo classe fora do PrimeiroPrograma n�o precisa importar
 */

class Livros {
	private String nome;
	private String npag;

}
