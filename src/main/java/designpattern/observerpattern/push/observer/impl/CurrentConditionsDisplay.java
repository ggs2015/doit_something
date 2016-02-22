package designpattern.observerpattern.push.observer.impl;

import designpattern.observerpattern.push.display.DisplayElement;
import designpattern.observerpattern.push.observer.Observer;
import designpattern.observerpattern.push.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	//完成观察者在主题中的注册
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("current conditions:" + temperature +
				"F degrees and" + humidity + "% humidity");
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
