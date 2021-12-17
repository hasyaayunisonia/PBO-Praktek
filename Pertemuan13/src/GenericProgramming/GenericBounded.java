/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author Asus
 */

class Box<T extends Number> {
    private T panjang;
    private T lebar;
    private T tinggi;
    
    public Box(T panjang, T lebar, T tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double getVolume() {
        return panjang.doubleValue() * lebar.doubleValue() * tinggi.doubleValue();
    }
}
public class GenericBounded {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(24, 10, 23);
        System.out.println("Volume dari box1 adalah " + box1.getVolume());
        
        Box<Float> box2 = new Box<>(2.0f, 3.0f, 4.0f);
        System.out.println("Volume dari box2 adalah " + box2.getVolume());
        
        Box<Double> box3 = new Box<>(17.2, 22.0, 19.6);
        System.out.println("Volume dari box3 adalah " + box3.getVolume());
    }
}
