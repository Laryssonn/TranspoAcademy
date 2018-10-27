package br.cursojava.aula006;

import java.util.Scanner;

public class AppAnimal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Animal[] animais = new Animal[30];
		int cont = 1;
		int indice = 0;

		while (cont != 99) {
			mostrarMenu();
			cont = Integer.parseInt(teclado.nextLine());

			switch (cont) {
			case 1:
				cadastrarCachorro(teclado, animais, indice);
				break;
			case 2:
				cadastrarGatos(teclado, animais, indice);
				break;
			case 3:
				mostrarAnimais(animais);
				break;
			}

		}
	}

	private static void cadastrarCachorro(Scanner teclado, Animal[] animais, int indice) {
		Animal animalDog = new Cachorro();
		System.out.println("Informe o nome do Cachorro");
		animalDog.setNome(teclado.nextLine());
		System.out.println("Informe a idade do Cachorro");
		animalDog.setIdade(Integer.parseInt(teclado.nextLine()));
		animais[indice] = animalDog;
		indice++;
	}

	public static void cadastrarGatos(Scanner teclado, Animal[] animais, int indice) {
		Animal animalCat = new Gato();
		System.out.println("Informe o nome do Gato");
		animalCat.setNome(teclado.nextLine());
		System.out.println("Informe a idade do Gato");
		animalCat.setIdade(Integer.parseInt(teclado.nextLine()));
		animais[indice] = animalCat;
		indice++;
	}

	public static void mostrarAnimais(Animal[] animais) {
		for (int x = 0; x < animais.length; x++) {
			System.out.printf("Tipo: %s\n", animais[x] instanceof Cachorro ? "Cachorro" : "Gato");
			System.out.printf("Nome: %s\n", animais[x].getNome());
			System.out.printf("Idade: %d\n", animais[x].getIdade());
			if (animais[x] instanceof Gato) {
				((Gato) animais[x]).comer("Ração", 5);
			} else {
				animais[x].comer();
			}
			animais[x].corre();
			System.out.println("**********************************************");
		}
	}

	public static void mostrarMenu() {
		System.out.println("1 - Cadastrar Cachorro");
		System.out.println("2 - Cadastrar Gato");
		System.out.println("3 - Listar Animais Cadastrados");
	}
}
