import java.util.Scanner;

public class bmicalci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double w = sc.nextDouble();
        System.out.print("Input height in meters: ");
        double h = sc.nextDouble();
        double BMI = w / (h * h);
        System.out.print("The BMI is " + BMI + " kg/m2");
    }
}