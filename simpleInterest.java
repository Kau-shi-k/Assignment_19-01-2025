import java.util.Scanner;
public class simpleInterest{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the principal");
	   float principal = sc.nextFloat();
	   System.out.println("Enter the Time");
	   float time = sc.nextFloat();
	   System.out.println("Enter the Rate");
	   float rate = sc.nextFloat();
	   double simpleInterest;
	   simpleInterest = (principal*time*rate)/100;
	   System.out.println(simpleInterest + " " + "Is The Simple Interest");
	}
}