package designpattern.observerpattern.pull.subject;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float huidity;
	private float pressure;
	
	public WeatherData(){}
	
	public void measurementsChanged(){
		//在必要的时候通知观察者
		setChanged();
		//没有调用notifyObservers传递数据对象，采用拉数据方法，用public get方法拉数据
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float huidity,float pressure){
		this.temperature = temperature;
		this.huidity = huidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	//get方法让观察者可以主动拉取想要的数据
	public float getTemperature() {
		return temperature;
	}

	public float getHuidity() {
		return huidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
