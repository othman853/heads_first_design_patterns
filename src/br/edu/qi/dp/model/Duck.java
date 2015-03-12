package br.edu.qi.dp.model;

import br.edu.qi.dp.interfaces.FlyingBehaviour;
import br.edu.qi.dp.interfaces.QuackingBehaviour;

public abstract class Duck {
	
	private QuackingBehaviour quackingBehaviour;
	private FlyingBehaviour flyingBehaviour;	
	
	public Duck(QuackingBehaviour quackingBehaviour, FlyingBehaviour flyingBehaviour) {		
		this.quackingBehaviour = quackingBehaviour;
		this.flyingBehaviour = flyingBehaviour;
	}
	
	public abstract void display();
	
	public void performFly(){
		flyingBehaviour.fly();
	}
	
	public void performQuack(){
		quackingBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("All ducks can swim.");
	}

}
