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
public class Square extends Rectangle{
//    private double side;

    public Square() {
        super();
    }
    
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }
    
    public Square(double side, String color, boolean filled ) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
//        return side;
       return super.getWidth();
        
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }
    
    @Override
    public void setWidth(double side) {
//        super.setWidth(width);
        super.setWidth(side);
    }
   
    @Override
    public void setLength(double side) {
//        super.setLength(length);
        super.setLength(side);
    }
    
//    /** Returns the area of this Circle instance
//     * @return  */
//    @Override
//    public double getArea() {
//        return getSide()*getSide();
//    }
//    
//    @Override
//    public double getPerimeter() {
//        return 4*getSide();
//    }
    
    @Override
    public String toString() {
        return "A Square with side= " + this.getSide() + ", " + "which is a subclass of \n" +  super.toString();
    }
}
