package br.edu.univas.factory;


import br.edu.univas.vo.Animais;
import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class FactoryVertebrado implements AbstractFactory {
	@Override
	public Animal getAnimal(Animais animalType) {
		if (animalType.equals(Animais.Elephant)) {
			return new Elephant();
		} else if (animalType.equals(Animais.Shark)) {
			return new Shark();
		}
		return null;
	}
}