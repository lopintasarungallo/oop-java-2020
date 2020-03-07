

import java.util.Scanner;

/**
 * Main
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner acm = new Scanner(System.in);
        double widht = acm.nextDouble();
        double height = acm.nextDouble();
        double depth = acm.nextDouble();
        double mass = acm.nextDouble();
        Box box = new Box(widht, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass * 2);
        System.out.println("Massa jenis = " + box.getDensity());
    }
}