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

import java.text.DecimalFormat;
/* Computes the amount of paint needed to paint various things. Uses the amount method of the paint class which
takes any Shape as parameter */

public class PaintThings {
    //Creates some shapes and a Paint object and prints the amount of paint needed to paint each shape
    
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
//        Rectangle deck;
//        Sphere bigBall;
//        Cylinder tank;

        /*Instantiate the three shape objects: deck to be a 20 by 35 foot rectangle, 
        bigBall to be a sphere of radius 15, and 
        tank to be a cylinder of radius 10 and height 30. */
        Rectangle deck = new Rectangle(20,35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10,30);
        
        /* Make the appropriate method calls to assign the correct values to the three amount variables */
        double deckAmt, ballAmt, tankAmt;
        
        //instantiate the three shapes to paint
        //compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        //print the amount of paint needed for each shape
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
//        System.out.println(deck.toString());
        System.out.println("Big Ball " + fmt.format(ballAmt));
//        System.out.println(bigBall.toString());
        System.out.println("Tank " + fmt.format(tankAmt));
//        System.out.println(tank.toString());
        
    }
}
