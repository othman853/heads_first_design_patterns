package br.edu.qi.dp.model;

import br.edu.qi.dp.interfaces.FlyingBehaviour;
import br.edu.qi.dp.interfaces.QuackingBehaviour;

public class Mallard extends Duck{	
	
	public Mallard(QuackingBehaviour quackingBehaviour, FlyingBehaviour flyingBehaviour) {
		super(quackingBehaviour, flyingBehaviour);
	}

	@Override
	public void display() {
		System.out.println("A Mallard.");
		
	}

}
