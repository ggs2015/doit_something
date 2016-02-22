package designpattern.observerpattern.push.subject;

import designpattern.observerpattern.push.observer.Observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
