package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeCup<T> {

	private ArrayList<T> innerObject = new ArrayList<T>();
	
	public CoffeeCup() {}
	
	public CoffeeCup(ArrayList<T> innerObject) {
		this.innerObject = innerObject;
	}
	
	public void add(T o) {
		innerObject.add(o);
	}
	
	public Iterator<T> getIterator() {
		return new CoffeeCupIterator(innerObject) {
			private int i;
			
			@Override
			public boolean hasNext() {
				if(i < getElementData().size())
					return true;
				return false;
			}
			
			@Override
			public T next() {
				T data = getElementData().get(i);
				i++;
				return data;
			}
			
			@Override
			public void remove() {
				getElementData().remove(i);
			}
		};
	}
	
	ArrayList<T> getObjects() {
		return new ArrayList<T>();
	}
	
	@Override
	public String toString() {
		return innerObject.toString();
	}
	
	abstract class CoffeeCupIterator implements Iterator<T>{
		
		private CoffeeCup<T> myCup;
		private ArrayList<T> elementData;
		
		public CoffeeCupIterator(ArrayList<T> innerObject) {
			this.setElementData(innerObject);
		}
		
		public CoffeeCup<T> getMyCup() {
			return myCup;
		}

		public void setMyCup(CoffeeCup<T> myCup) {
			this.myCup = myCup;
		}

		public ArrayList<T> getElementData() {
			return elementData;
		}

		public void setElementData(ArrayList<T> elementData) {
			this.elementData = elementData;
		}
	}
}


