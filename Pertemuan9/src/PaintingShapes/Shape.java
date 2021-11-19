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

public abstract class Shape {
//    An instance variable shapeName of type String
    private String shapeName;
    
//    An abstract method area() 
    public abstract double area();
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
//    A toString method that returns the name of the shape
    @Override
    public String toString() {
        return shapeName;
    }
     
}
