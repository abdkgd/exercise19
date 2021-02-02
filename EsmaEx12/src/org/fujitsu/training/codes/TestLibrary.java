package org.fujitsu.training.codes;

import org.fujitsu.training.codes.exception.AuthorException;
import org.fujitsu.training.codes.exception.BookException;

public class TestLibrary {

	
	public static void main(String[] args) {
		
		
		try {
			Author eunice = Author.getInstance("Eunice", "eto@gmail.com", 'F');
			Author jeff = Author.getInstance("Jeffrey", "eto@gmail.com", 'M');
			Author dan = Author.getInstance("Dan", "eto@gmail.com", 'M');
			Author maynard = Author.getInstance("Maynard", "eto@gmail.com", 'M');
			//Author migs = Author.getInstance("Migs", "eto@gmail.com", 'M');
			
			// uncomment the next statement to show the exception
			//	Author herman = Author.getInstance("Herman", "eto@gmail.com", 'M');
			
			
			Book math = Book.getInstance("Math", jeff, 5000, 2);
			Book japanese = Book.getInstance("Japanese", dan, 7000, 1);
			
			
			System.out.println(jeff.toString());
			System.out.println(math.toString());
			
			
		} catch (AuthorException e1) {
			System.out.println(e1.getMessage());
		}
		catch (BookException e1) {
			System.out.println(e1.getMessage());
		}
		catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
	
		
	
	}
}
