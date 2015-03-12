package br.edu.qi.dp.main;

import br.edu.qi.dp.implementations.FlyWithWings;
import br.edu.qi.dp.implementations.Quack;
import br.edu.qi.dp.interfaces.FlyingBehaviour;
import br.edu.qi.dp.interfaces.QuackingBehaviour;
import br.edu.qi.dp.model.Duck;
import br.edu.qi.dp.model.Mallard;

public class DuckSimulator {
	
	public static void main(String[] args) {
		
		QuackingBehaviour quackingBehaviour = new Quack();
		FlyingBehaviour flyingBehaviour = new FlyWithWings();
		
		Duck mallard = new Mallard(quackingBehaviour, flyingBehaviour);
		
		mallard.performFly();
		mallard.performQuack();
	}

}
