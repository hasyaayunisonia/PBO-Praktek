/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task7_1;

/**
 *
 * @author Asus
 */
public class Cat extends Animal {
   @Override
   public void sound() {
       System.out.println("Meow");
   }
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();//method sound() dari class Cat akan dipanggil
    }
}
