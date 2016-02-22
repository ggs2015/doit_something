package designpattern.observerpattern.push;

import designpattern.observerpattern.push.observer.impl.CurrentConditionsDisplay;
import designpattern.observerpattern.push.observer.impl.ForecastDiplay;
import designpattern.observerpattern.push.observer.impl.StatisticsDisplsy;
import designpattern.observerpattern.push.subject.impl.WeatherData;

public class WeatherStation {
	public static void main(String[] srgs){
		WeatherData weatherData = new WeatherData();
		
		//完成注册
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData);
		ForecastDiplay forecastDiplay = 
				new ForecastDiplay(weatherData);
		StatisticsDisplsy statisticsDisplsy = 
				new StatisticsDisplsy(weatherData);
		//改变状态，自动通知观察者
		weatherData.setMeasurements(80, 70, 20);
		weatherData.setMeasurements(83, 75, 27);
		weatherData.setMeasurements(86, 78, 28);
	}
}
