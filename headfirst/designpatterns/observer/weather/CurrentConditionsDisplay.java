package headfirst.designpatterns.observer.weather;
	
public class CurrentConditionsDisplay implements headfirst.designpatterns.observer.weather.Observer, headfirst.designpatterns.observer.weather.DisplayElement {
	private float temperature;
	private float humidity;
	private headfirst.designpatterns.observer.weather.WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
