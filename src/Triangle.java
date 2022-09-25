public class Triangle {
    /**
     * Declare the private variables
     */


     private double x1, y1, x2, y2, x3, y3;


     /**
     Create a constructor to get the coordinates of the triangle
     */
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)

    {

        this.x1 = x1;

        this.y1 = y1;

        this.x2 = x2;

        this.y2 = y2;

        this.x3 = x3;

        this.y3 = y3;

    }


    /**
     *  Function definition to get the length of side 1
     */
    public double getSide1Length()

    {

        /**
         * Return the length of side 1
         */

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

    }

    /**
     *  Function definition to get the length of side 2
     */

    public double getSide2Length()

    {
        /**
         * Return the length of side 2
         */

        return Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

    }

    /**
     * Function definition to get the length of side 3
     */

    public double getSide3Length()

    {

        /**
         *  Return the length of side 3
         */

        return Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

    }

    /**
     * Function definition to get the angle of corner 1
     */

    public double getAngle1()

    {

        double a = getSide3Length();

        double b = getSide1Length();

        double c = getSide2Length();

        /**
         * Compute and return the angle of corner 1
         */

        return Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c));

    }

    /**
     *  Function definition to get the angle of corner 2
     */

    public double getAngle2()

    {

        double a = getSide3Length();

        double b = getSide1Length();

        double c = getSide2Length();

        // Compute and return the angle of corner 2

        return Math.acos(((b * b) + (a * a) - (c * c)) / (2 * b * a));

    }

    /**
     *  Function definition to get the angle of corner 3
     */
    public double getAngle3()

    {

        double a = getSide3Length();

        double b = getSide1Length();

        double c = getSide2Length();

        // Compute and return the angle of corner 3

        return Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c));

    }


    /**
     *  Function definition to get the  perimeter of a triangle
     */

    public double getPerimeter()

    {

        /**
         * Compute and return the perimeter of a triangle
         */

        return getSide1Length() + getSide2Length() + getSide3Length();

    }

    /**
     *  Function definition to get the  area of a triangle
     */

    public double getArea()

    {

        double s = getPerimeter() / 2.0;

        double a = getSide1Length();

        double b = getSide2Length();

        double c = getSide3Length();

        /**
         * Compute and return the area of a triangle
         */
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

}
