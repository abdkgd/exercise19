package org.fujitsu.training.objects;

public class TestLeCreamDeApp {

	public static void main(String[] args) {
		LeCreamDeApp app = new LeCreamDeApp(IceCreamFlavors.ALMOND_CRUNCH, 2, false);
		app.run();
		
		app.setLecream(new LeCream(IceCreamFlavors.CHOCOLATE, 2, true));
		app.run();
		
		app.setLecream(new LeCream(IceCreamFlavors.STRABERRY, 3, false));
		app.run();
		
		app.setLecream(new LeCream(IceCreamFlavors.MANGO, 4, true));
		app.run();
	}	
}
