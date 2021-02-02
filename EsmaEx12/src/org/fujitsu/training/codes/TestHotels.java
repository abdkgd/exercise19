package org.fujitsu.training.codes;

public class TestHotels {

	
	public static void main(String[] args) {
		
		Rooms engineeringOffice = new Rooms();
		Rooms Pantry = new Rooms();
		Rooms serverRoom = new Rooms();
		
		Hotel hotelOne = new Hotel(engineeringOffice, Pantry, serverRoom);
		Hotel hotelTwo = new Hotel(engineeringOffice, serverRoom);
		Hotel hotelThree = new Hotel(engineeringOffice, Pantry, serverRoom);
		Hotel hotelFour = new Hotel(Pantry, serverRoom);
		Hotel hotelFive = new Hotel(engineeringOffice, Pantry);
		
		try {
			hotelOne.setRoom(Pantry);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No available room");
		} catch (Exception e) {
			System.out.println("No available room");
		}
		
		engineeringOffice.setNumberOfPersons(6);
		engineeringOffice.setRate(3.4F);
		
		Pantry.setNumberOfPersons(5);
		Pantry.setRate(1F);
		
		serverRoom.setNumberOfPersons(1);
		serverRoom.setRate(1.2F);
		
		System.out.println();
		
		for (Rooms room : hotelOne.getRoom()) {
			System.out.println(room.toString());
		}
		System.out.println();
		
		for (Rooms room : hotelTwo.getRoom()) {
			System.out.println(room.toString());
		}
		System.out.println();
		
		for (Rooms room : hotelThree.getRoom()) {
			System.out.println(room.toString());
		}
		System.out.println();
		
		for (Rooms room : hotelFour.getRoom()) {
			System.out.println(room.toString());
		}
		System.out.println();
		
		for (Rooms room : hotelFive.getRoom()) {
			System.out.println(room.toString());
		}
		System.out.println();
		
		
		
		
		
	}
}
