package designPattern.observer.weather;


//테스트용 클래스
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
    }
}
