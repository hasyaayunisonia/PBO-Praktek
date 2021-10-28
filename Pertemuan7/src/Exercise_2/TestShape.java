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

public class TestShape {
    public static void main(String[] args) {
        /*** Shape ***/
        System.out.println("======= Shape =======");
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        Shape shape2 = new Shape("green", false);
        System.out.println(shape2.toString());
        Shape shape3 = new Shape("white", true);
        System.out.println(shape3.toString());
        Shape shape4 = new Shape("brown", false);
        System.out.println(shape4.toString());
        
        /*** Circle ***/
        System.out.println("======= Circle =======");
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        Circle circle2 = new Circle(4.0);
        System.out.println(circle2.toString());
        Circle circle3 = new Circle(5.0 ,"yellow", false);
        System.out.println(circle3.toString());
        
        /*** Rectangle ***/
        System.out.println("======= Rectangle =======");
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString());
        System.out.println("Area = " + rectangle1.getArea() + " " + "Perimeter = " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(2.0 ,4.0);
        System.out.println(rectangle2.toString());
        System.out.println("Area = " + rectangle2.getArea() + " " + "Perimeter = " + rectangle2.getPerimeter());
        Rectangle rectangle3 = new Rectangle(8.0 ,9.0,"purple", true );
        System.out.println(rectangle3.toString());
        System.out.println("Area = " + rectangle3.getArea() + " " + "Perimeter = " + rectangle3.getPerimeter());
        Rectangle rectangle4 = new Rectangle(6.0 ,4.0,"black", false );
        System.out.println(rectangle4.toString());
        System.out.println("Area = " + rectangle4.getArea() + " " + "Perimeter = " + rectangle4.getPerimeter());
        
        /*** Square ***/
        System.out.println("======= Square =======");
        Square square1 = new Square();
        System.out.println(square1.toString());
        System.out.println("Area = " + square1.getArea() + " " + "Perimeter = " + square1.getPerimeter());
        Square square2 = new Square(10.0);
        System.out.println(square2.toString());
        System.out.println("Area = " + square2.getArea() + " " + "Perimeter = " + square2.getPerimeter());
        Square square3 = new Square(12.0, "pink", false);
        System.out.println(square3.toString());
        System.out.println("Area = " + square3.getArea() + " " + "Perimeter = " + square3.getPerimeter());
        Square square4 = new Square(15.0, "red", false);
        System.out.println(square4.toString());
        System.out.println("Area = " + square4.getArea() + " " + "Perimeter = " + square4.getPerimeter());
    }
}
