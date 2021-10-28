/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise_2;

/**
 *
 * @author Asus
 */

public class Circle extends Shape{
    private double radius; //variabel radius bertipe double dengan hak akses private

    public Circle() { // 1st (default) constructor
        super(); // call superclass no-arg constructor Shape()
        radius = 1.0; //variabel radius diisi value-nya dengan 1.0
    }
    
    public Circle(double radius) { // 2nd constructor
        super(); // call superclass no-arg constructor Shape()
        this.radius = radius; //variabel radius di class ini diisi value-nya 
                              //dengan parameter radius bertipe double
    }
    
    public Circle(double radius, String color, boolean filled) { // 3rd constructor
        super(color, filled); 
        this.radius = radius; //variabel radius di class ini diisi value-nya dengan 
                              //parameter radius bertipe double
//        super.setColor(color);// call superclass method setColor(String color)
//        super.setFilled(filled);// call superclass method setFilled(boolean filled)
    }
    
    /** Setter dan Getter untuk radius
     * @return s**/
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Returns the area of this Circle instance
     * @return  */
    public double getArea() { //untuk luas lingkaran
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter() { //untuk keliling lingkaran
        return 2*radius*Math.PI;
    }
    
    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", " +  "which is a subclass of " + super.toString(); // use Shape's toString()
    }
}
