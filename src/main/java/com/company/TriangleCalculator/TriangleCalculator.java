package com.company.TriangleCalculator;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Enter the adjacent side of a triangle: " );
        int adjacentSide = calculator.nextInt();
        calculator.nextLine();

        System.out.println("Enter the opposite side of a triangle: ");
        int oppositeSide = calculator.nextInt();
        calculator.nextLine();

        double hypotenuse = Math.hypot(adjacentSide,oppositeSide);
        System.out.println("The hypotenuse of your triangle is: " + hypotenuse);

        // SOHCAHTOA
        double sine = Math.sin(oppositeSide/hypotenuse);
        System.out.println("The sine of the triangle is: " + sine);

        double cosine = Math.cos(adjacentSide/hypotenuse);
        System.out.println("The cosine of the triangle is: " + cosine);

        double tangent = Math.tan(oppositeSide/adjacentSide);
        System.out.println("The tangent of your triangle is: " + tangent);




    }
}
