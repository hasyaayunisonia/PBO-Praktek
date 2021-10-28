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
public class Rectangle extends Shape{
    private double width; //variabel width bertipe double dengan hak akses private
    private double length; //variabel length bertipe double dengan hak akses private
    
    public Rectangle(){
        super(); // call superclass no-arg constructor Shape()
        this.width = 1.0; //variabel width diisi value-nya dengan 1.0
        this.length = 1.0; //variabel length diisi value-nya dengan 1.0
    }
    
    public Rectangle(double width, double length){
        super(); // call superclass no-arg constructor Shape()
        this.width = width; //variabel width di class ini diisi value-nya 
                            //dengan parameter width bertipe double
        this.length = length; //variabel length di class ini diisi value-nya 
                              //dengan parameter length bertipe double
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled); // call superclass no-arg constructor Shape()
        this.width = width; //variabel width di class ini diisi value-nya 
                            //dengan parameter width bertipe double
        this.length = length;
//        super.setColor(color);
//        super.setFilled(true);
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    /** Returns the area of this Circle instance
     * @return  */
    public double getArea() {
        return width*length;
    }
    
    public double getPerimeter() {
        return (2*width) + (2*length);
    }
    
    @Override
    public String toString() {
        return "A Rectangle with width= " + width + " and length = " + length + ", " + "which is a subclass of " + super.toString();
    }
}
