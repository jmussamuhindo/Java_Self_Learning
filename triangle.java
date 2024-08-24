import java.util.Scanner;
import java.lang.*;

public class triangle {
    public static void main(String[] args){
        int base, height, hip;
        float surf;
        double area;
        System.out.println("Enter base, height, hip");
        Scanner sc = new Scanner(System.in);

        base = sc.nextInt();
        height = sc.nextInt();
        hip = sc.nextInt();

        surf = (base+height+hip)/2f;
        area = Math.sqrt(surf*(surf-base)*(surf-height)*(surf-hip));
        System.out.println("The Area is " + area);    
    }
}