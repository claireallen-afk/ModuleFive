import java.util.ArrayList;
import java.util.Scanner;

public class OptionOne {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in); 
		
		ArrayList<String> dayOfWeek = new ArrayList<String>();
		ArrayList<Double> temp = new ArrayList<>();
		String input;
		int i;
		int j;
		double tempAverage;
		double sum = 0;
		
		dayOfWeek.add("monday");
		dayOfWeek.add("tuesday");
		dayOfWeek.add("wednesday");
		dayOfWeek.add("thursday");
		dayOfWeek.add("friday");
		dayOfWeek.add("saturday");
		dayOfWeek.add("sunday");
		dayOfWeek.add("week");
		
		temp.add(75.0);
		temp.add(76.0);
		temp.add(74.0);
		temp.add(75.0);
		temp.add(72.0);
		temp.add(76.0);
		temp.add(74.0);
		
		System.out.println("Please enter day of the week: ");
		input = scnr.next();
		
		for (i = 0; i < (dayOfWeek.size()); ++i) {
			if (input.equals(dayOfWeek.get(i)) && i < 7) {
				System.out.println("Day of the week: " + dayOfWeek.get(i));
				System.out.println("Temperature: " + temp.get(i));
			}
			else if (input.equals(dayOfWeek.get(i)) && i == 7) {
				for (j = 0; j < temp.size(); ++j) {
					sum = sum + temp.get(j);
				}
				
				tempAverage = sum / 7;
				
				System.out.println("Monday's temperature: " + temp.get(0));
				System.out.println("Tuesday's temperature: " + temp.get(1));
				System.out.println("Wednesday's temperature: " + temp.get(2));
				System.out.println("Thursday's temperature: " + temp.get(3));
				System.out.println("Friday's temperature: " + temp.get(4));
				System.out.println("Saturday's temperature: " + temp.get(5));
				System.out.println("Sunday's temperature: " + temp.get(6));
				System.out.printf("Weekly average: %.2f%n", tempAverage);
			}
		}		
	}
}
