package br.edu.univas.factory;
import br.edu.univas.vo.Animal;
import br.edu.univas.vo.AnimalType;

public class Factory {
	public static AbstractFactory getAnimal(AnimalType animalType) {
		if (animalType.equals(AnimalType.Invertebrado)) {
			return new FactoryInvertebrado();
		} else if (animalType.equals(AnimalType.Vertebrado)) {
			return new FactoryVertebrado();
		}
		return null;
	}
}
