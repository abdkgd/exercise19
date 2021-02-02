package org.fujitsu.training.codes;

import org.fujitsu.training.codes.exception.AuthorException;

public class Author {

	private String name;
	private String email;
	private char gender;
	private static int counter = 0;
	
	private Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public static Author getInstance(String name, String email, char gender) throws AuthorException, Exception{
		
		if(counter <= 5) {
			counter++;
			return new Author(name, email, gender);
		}
		
		throw new AuthorException();
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return String.join(" ", "Author:", name, email, gender+"");
	}

	
}
