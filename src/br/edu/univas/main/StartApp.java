package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;
import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			Elephant elephant = new Elephant();
			elephant.eat();
			
			Shark shark = new Shark();
			shark.eat();

		} else if (option == 2) {
			Bee bee = new Bee();
			bee.eat();
			
			Ant ant = new Ant();
			ant.eat();
		}
		
		scanner.close();
	}
}
