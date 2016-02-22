package designpattern.observerpattern.pull;

import designpattern.observerpattern.pull.observer.CurrentConditionsDisplay;
import designpattern.observerpattern.pull.subject.WeatherData;


public class WeatherStation {
	public static void main(String[] srgs){
		WeatherData weatherData = new WeatherData();
		
		//完成注册
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		//改变状态，自动通知观察者
		weatherData.setMeasurements(80, 70, 20);
		weatherData.setMeasurements(83, 75, 27);
		weatherData.setMeasurements(86, 78, 28);
	}
}
