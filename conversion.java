import java.util.Scanner;
public class conversion{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Temperature in Celsius");
	   int celsius = sc.nextInt();
	   int Fahrenheit;
	   Fahrenheit = (celsius * 9/5) + 32;
	   System.out.println("Celsius to Fahrenheit is" + Fahrenheit);
	}
}