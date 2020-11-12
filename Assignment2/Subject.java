package cpp.cs3560.assignment2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : observers) {
			
			observer.update(this);

		}
	}
	

}

