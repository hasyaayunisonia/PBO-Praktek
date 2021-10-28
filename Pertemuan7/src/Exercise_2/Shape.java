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

public class Shape {
    
    private String color; //variabel color bertipe string dengan hak akses private
    private boolean filled; //variabel filled bertipe boolean dengan hak akses private
    
    // Constructors (overloaded)
    /** Constructs a Shape instance with default value for color and filled */
    public Shape() { // 1st (default) constructor
        color = "green"; //variabel color diisi value-nya dengan "green"
        filled = true; //variabel filled diisi value-nya dengan true
    }
    
    public Shape(String color, boolean filled) { // 2nd constructor
        this.color = color; //variabel color di class ini diisi value-nya dengan parameter color bertipe string
        this.filled = filled; //variabel filled di class ini diisi value-nya dengan parameter filled bertipe boolean
    }
    
    /** Returns the color
     * @return  */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
     /** Returns the filled
     * @return  */
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public String toString(){
        if( isFilled() ) {
            //ketika isFilled() bernilai true
            return "A Shape with color of " + color + " and filled";
        } else {
            //ketika isFilled() bernilai false
            return "A Shape with color of " + color + " and Not filled";
        }
    }
}
