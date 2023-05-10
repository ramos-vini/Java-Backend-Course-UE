package day3;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int temperature, humidity;
		
		System.out.println("Enter the current temperature (ºC):");
		temperature = scanner.nextInt();
		
		System.out.println("Enter the current humidity (%):");
		humidity = scanner.nextInt();
		
		String weatherCondition;
		
		if(temperature > 35) {
			if(humidity > 55) {
				weatherCondition = "The weather is too hot.";
			} else {
				weatherCondition = "The weather is hot.";
			}
			
		} else if (temperature >= 20){
			if(humidity > 55) {
				weatherCondition = "Normal summer weather.";
			} else {
				weatherCondition = "Nice summer weather.";
			}
			
		} else if (temperature >= 2) {
			weatherCondition = "Nice winter weather.";
			
		} else {
			weatherCondition = "Very cold weather.";
		}
		
		System.out.println(weatherCondition);
		
		scanner.close();
	}
}
