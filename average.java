import java.util.Scanner;
public class average{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the first number");
	   float num1 = sc.nextFloat();
	   System.out.println("Enter the second number");
	   float num2 = sc.nextFloat();
	   System.out.println("Enter the third number");
	   float num3 = sc.nextFloat();
	   float average;
	   average = (num1 + num2 + num3)/3;
	   System.out.println(average + " " + "Average of three numbers are");
	}
}