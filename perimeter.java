import java.util.Scanner;
public class perimeter{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Length");
	   float length = sc.nextFloat();
	   System.out.println("Enter the Width");
	   float width = sc.nextFloat();
	   double perimeter;
	   perimeter = 2 * (length + width);
	   System.out.println(perimeter + " " + "Is The Perimeter Of Rectangle");
	}
}
	   