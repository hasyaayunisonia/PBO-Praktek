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

/* Represents a sphere */
public class Sphere extends Shape{
    private double radius; //radius in feet
    
    //Constructor : Sets up the sphere
    public Sphere (double r) {
        super("Sphere");
        radius = r;
    }
    
    //returns the surface area of the sphere
    public double area() {
        return 4*Math.PI*radius*radius;
    }
    
    //returns the sphere as a String
    public String toString() {
        return super.toString() + " of radius " + radius;
    } 
}
