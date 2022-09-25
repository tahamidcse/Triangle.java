/** Importing input package
 *
 * */

import java.util.Scanner;

/**
 * Class definition
 */
public class TrianglePropertyPrinter {

    /** Main method definition
     *
     */

    public static void main(String[] args)

    {

/**
 *Creating scanner class object to read user input
 *
 */

        Scanner scan = new Scanner(System.in);

        /** Asking the user to enter x and y coordinates
         */

        System.out.println("Enter the x,y coordinates of three points in this order x1,y1,x2,y2,x3,y3: ");


/**
 * Declare the required variables to store x and y coordinate values
 */
        double x1 = scan.nextDouble();

        double y1 = scan.nextDouble();

        double x2 = scan.nextDouble();

        double y2 = scan.nextDouble();

        double x3 = scan.nextDouble();

        double y3 = scan.nextDouble();

        /**
         * Create an object for Triangle class to determine the length of all three sides, the angle of all three corners, the perimeter and area of a triangle
         *
         **/

        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);


        /**
         * Print the length of side 1
         */
        System.out.println("Side 1 length:  " + triangle.getSide1Length());

        /**
         * Print the length of side
         */

        System.out.println("Side 2 length:  " + triangle.getSide2Length());

        /**
         * Print the length of side 3
         */

        System.out.println("Side 3 length:  " + triangle.getSide3Length());

        /**
         * Print the angle of corner 1
         */
        System.out.println("Angle 1:  " + triangle.getAngle1());

        /**
         * Print the angle of corner 2
         */
        System.out.println("Angle 2:  " + triangle.getAngle2());

        /**
         * Print the angle of corner 3
         */

        System.out.println("Angle 3:  " + triangle.getAngle3());


        /***
         Print the perimeter of triangle
         */
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());

        /***
         Print the area of triangle
         */

        System.out.println("The area of the triangle is " + triangle.getArea());

    }

}
