package designpattern.observerpattern.push.observer.impl;

import designpattern.observerpattern.push.display.DisplayElement;
import designpattern.observerpattern.push.observer.Observer;
import designpattern.observerpattern.push.subject.Subject;

public class StatisticsDisplsy implements Observer, DisplayElement {

	private Subject weatherData;
	
	//完成观察者在主题中的注册
	public StatisticsDisplsy(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplsy");
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		display();
	}

}
