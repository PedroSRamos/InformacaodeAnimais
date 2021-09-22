package br.edu.univas.factory;

import br.edu.univas.vo.Animais;
import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;

public class FactoryInvertebrado implements AbstractFactory {
	@Override
	public Animal getAnimal(Animais animalType) {
		if (animalType.equals(Animais.Bee)) {
			return new Bee();
		} else if (animalType.equals(Animais.Ant)) {
			return new Ant();
		}
		return null;
	}
}