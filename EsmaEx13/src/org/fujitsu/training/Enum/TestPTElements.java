package org.fujitsu.training.Enum;

public class TestPTElements {

	public static void main(String[] args) {
		PTElements categories[] = PTElements.values();
		
		for (PTElements ptElements : categories) {
		
			for (Elements element : ptElements.getElements()) {
				System.out.println(element.toString());
			}
		}
	}
}
