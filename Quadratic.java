import java.util.Scanner;
import java.lang.*;

public class Quadratic {
    public static void main(String[] args){
        int a,b,c;
        double r1, r2;
        System.out.println("Enter the values of a, b and c ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2= (-b - Math.sqrt(b*b-4*a*c))/(2*a); 
        System.out.println("The root of Quadratic Equation are: " + r1 + " " + r2);

    }
}
