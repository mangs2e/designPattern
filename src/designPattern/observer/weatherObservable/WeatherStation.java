package designPattern.observer.weatherObservable;



//테스트용 클래스
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
        weatherData.setMeasurements((float) (Math.random()*100), (float) (Math.random()*100), (float) (Math.random()*100));
    }
}
