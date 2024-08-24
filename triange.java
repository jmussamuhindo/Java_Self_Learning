import java.util.*;
import java.lang.*;

public class triange {
    public static void main(String[] args){
        float base, height, area;
        System.out.println("Enter the base and heigt: ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = base * height / 2;
        System.out.println("The area of Triangle is " +area);
    }
}

