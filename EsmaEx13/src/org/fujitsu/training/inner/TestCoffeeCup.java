package org.fujitsu.training.inner;

import java.util.ArrayList;

public class TestCoffeeCup {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(6);
		
		CoffeeCup<String> cup = new CoffeeCup<String>();
		
		cup.add("Chocolate");
		cup.add("Mocha");
		cup.add("Cookies");
		cup.add("Black");
		System.out.println(cup);
		
		CoffeeCup<Integer> cup2 = new CoffeeCup<Integer>(li);
		
		System.out.println(cup2);
		
		
	}
}
