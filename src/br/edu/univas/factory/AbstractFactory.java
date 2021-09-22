
package br.edu.univas.factory;

import br.edu.univas.vo.Animais;
import br.edu.univas.vo.Animal;

public interface AbstractFactory {

	Animal getAnimal(Animais animal);

	
}