/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

/**
 *
 * @author Asus
 */

public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        super("Rectangle"); // call superclass no-arg constructor Shape()
        this.width = width; //variabel width di class ini diisi value-nya 
                            //dengan parameter width bertipe double
        this.length = length; //variabel length di class ini diisi value-nya 
                              //dengan parameter length bertipe double
    }
    
     public double area() {
         return width*length;
     }
    
    public String toString() {
        return super.toString() + " of width " + width + " and length " + length;
    } 
    
}
