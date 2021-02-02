package org.fujitsu.training.inner;

import java.util.Arrays;

public class TestMyFilter {

	public static void main(String[] args) {
		Filter filter1 = new Filter() {
			
			@Override
			public boolean accept(String x) {
				if(x.length() <= 3)
					return true;
				return false;
			}
		};

		Filter filter2 = new Filter() {
			
			@Override
			public boolean accept(String x) {
				if(x.endsWith("s"))
					return true;
				return false;
			}
		};
		
		Filter filter3 = new Filter() {
			
			@Override
			public boolean accept(String x) {
				StringBuilder sb = new StringBuilder(x);
				sb.reverse();
				
				if(x.equals(sb.toString()))
					return true;
				return false;
			}
		};
		
		Filter filter4 = new Filter() {
			
			@Override
			public boolean accept(String x) {
				if(Character.isDigit(x.toCharArray()[0]))
					return true;
				return false;
			}
		};

		Filter filter5 = new Filter() {
			
			@Override
			public boolean accept(String x) {
				if(x.length() % 2 != 0)
					return true;
				return false;
			}
		};
		
		String[] setOfStrings = {"hello", "civic", "or", "as", "congrats", "snakes", "24 Karat", "numberics"};
		
		System.out.println(Arrays.toString(MyFilter.filters(setOfStrings, filter1)));
		System.out.println(Arrays.toString(MyFilter.filters(setOfStrings, filter2)));
		System.out.println(Arrays.toString(MyFilter.filters(setOfStrings, filter3)));
		System.out.println(Arrays.toString(MyFilter.filters(setOfStrings, filter4)));
		System.out.println(Arrays.toString(MyFilter.filters(setOfStrings, filter5)));
	}
}
