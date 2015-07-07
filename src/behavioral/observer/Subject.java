package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	private void notifyAllObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}

	public void attach(Observer o) {
		observers.add(o);
	}

}
