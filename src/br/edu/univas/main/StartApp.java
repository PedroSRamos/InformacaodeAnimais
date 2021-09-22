package br.edu.univas.main;

import java.util.Scanner;
import br.edu.univas.factory.Factory;

import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;
import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;
import br.edu.univas.vo.Animais;
import br.edu.univas.vo.Animal;
import br.edu.univas.vo.AnimalType;
public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			br.edu.univas.factory.AbstractFactory factory1 = Factory.getAnimal(AnimalType.Vertebrado);
			Animal elephant = factory1.getAnimal(Animais.Elephant);
			elephant.eat();

			br.edu.univas.factory.AbstractFactory factory2 = Factory.getAnimal(AnimalType.Vertebrado);
			Animal shark = factory2.getAnimal(Animais.Shark);
			shark.eat();

		} else if (option == 2) {
			br.edu.univas.factory.AbstractFactory factory1 = Factory.getAnimal(AnimalType.Invertebrado);
			Animal bee = factory1.getAnimal(Animais.Bee);
			bee.eat();

			br.edu.univas.factory.AbstractFactory factory2 = Factory.getAnimal(AnimalType.Invertebrado);
			Animal ant = factory2.getAnimal(Animais.Ant);
			ant.eat();
		}

		scanner.close();
	}
}
