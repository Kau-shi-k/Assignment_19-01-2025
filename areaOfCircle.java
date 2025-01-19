import java.util.Scanner;
public class areaOfCircle{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Radius of the Circle");
	   float radius = sc.nextFloat();
	   float pie = 3.14f;
	   float area;
	   area = pie * radius * radius;
	   System.out.println(area + " " + "Area of the circle");
	}
}