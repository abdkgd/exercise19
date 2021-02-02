package org.fujitsu.training.codes;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	private List<Rooms> room = new ArrayList<Rooms>();
	private final int ROOM_LENTH = 3;

	public Hotel(Rooms room1) {
		this.room.add(room1);
	}

	public Hotel(Rooms room1, Rooms room2) {
		this(room2);
		this.room.add(room1);
	}

	public Hotel(Rooms room1, Rooms room2, Rooms room3) {
		this(room2, room3);
		this.room.add(room1);
	}

	public List<Rooms> getRoom() {
		return room;
	}

	public void setRoom(Rooms room) throws IndexOutOfBoundsException, Exception{

		if (this.room.size() < ROOM_LENTH)
			this.room.add(room);
		else
			throw new IndexOutOfBoundsException();
	}

}
