package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.List;

public class MyFilter {

	public static String[] filters(String[] a, Filter f) {
		List<String> acceptedStrings = new ArrayList<String>();
		
		for (String string : a) {
			if(f.accept(string)) {
				acceptedStrings.add(string);
			}				
		}
		
		return acceptedStrings.toArray(new String[0]);
	}
	
}
