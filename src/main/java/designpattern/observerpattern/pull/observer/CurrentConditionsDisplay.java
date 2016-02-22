package designpattern.observerpattern.pull.observer;

import java.util.Observable;
import java.util.Observer;

import designpattern.observerpattern.pull.subject.WeatherData;
import designpattern.observerpattern.push.display.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;
	
	//注册观察者
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions:" + temperature +
				"F degrees and " + humidity + "% humidity");
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			//主动拉取想要的数据
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHuidity();
			//展示
			display();
		}
	}

}
