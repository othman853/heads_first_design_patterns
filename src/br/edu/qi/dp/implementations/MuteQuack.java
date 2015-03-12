package br.edu.qi.dp.implementations;

import br.edu.qi.dp.interfaces.QuackingBehaviour;

public class MuteQuack implements QuackingBehaviour{
	
	public void quack(){
		System.out.println("<<Silence>>");
	}

}
