package Question_9;
import java.util.*;

public class question_9 {

    static double searchQuadrangleArea(double x, double y, double z, double t ){

        double d = Math.sqrt(x*x+y*y);
        double s1 = x*y*0.5;
        double s2 = Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d))*0.25;
        return Math.rint((s1+s2)*100)/100;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter k: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter z: ");
        double z = scanner.nextDouble();
        System.out.print("Enter t: ");
        double t = scanner.nextDouble();

        searchQuadrangleArea(x,y,z,t);
        System.out.print("The area will be equal: " + searchQuadrangleArea(x,y,z,t));
    }
}
