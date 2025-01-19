import java.util.Scanner;
public class volume{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Radius of the Cylinder");
	   float radius = sc.nextFloat();
	   System.out.println("Enter the Height of the Cylinder");
	   float height = sc.nextFloat();
	   double volume;
	   volume = Math.PI * radius * radius * height;
	   
	   System.out.println("Volume of the Cylinder is" + " " + volume);
	   sc.close();
	}
}