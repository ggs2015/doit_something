package designpattern.observerpattern.push.subject.impl;

import java.util.ArrayList;

import designpattern.observerpattern.push.observer.Observer;
import designpattern.observerpattern.push.subject.Subject;

public class WeatherData implements Subject {
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	//注册观察者
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	//销毁观察者
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	//通知观察者
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	//改变主题中的状态(主题有变化，主动通知观察者)
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	//weatherDate的其他方法
}
