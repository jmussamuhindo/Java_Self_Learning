import java.util.Scanner;
import java.lang.*;

public class cube {
    public static void main(String[] args){
     int length, height, breadth;
     double volume,total_area;

     System.out.println("Enter the value of Length, height, breadth: ");
     Scanner sc = new Scanner(System.in);
     length = sc.nextInt();
     height = sc.nextInt();
     breadth = sc.nextInt();
     volume = length * breadth * height;
     total_area = 2*(length * height+breadth * height+length * breadth);

     System.out.println("The Are of Cube is " + total_area);
     System.out.println("The Volume of cube is " + volume);
    }
}