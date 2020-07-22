package epam.java8_features_task;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
public class App 
{
		
  static double average(List<Integer> inputList)
    {
	    OptionalDouble a=inputList.stream()
	    	    .mapToInt(i -> i) 
	    	    .average();
	    return a.isPresent()  ? a.getAsDouble() : 0;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int n = sc.nextInt();
		List<Integer> inputList = new ArrayList<Integer>(n);
		System.out.println("Enter the numbers to the list");
		for(int i = 0; i < n; i++)
			inputList.add(sc.nextInt());
		System.out.println("Average of list of numbers is "+average(inputList));
		sc.close();
	}
	
}

