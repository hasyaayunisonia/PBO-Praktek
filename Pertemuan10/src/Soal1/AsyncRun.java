/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author Asus
 */
public class AsyncRun implements Runnable {
    @Override
    public void run () {
//        System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId());
//        throw new ArithmeticException();
        try {
            System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId());
            throw new ArithmeticException();
        }
        catch (Exception ex) {
            System.out.println(ex.getClass().getName() + " handled");
        }
    }
    
    public static void main(String[] args) {
        try {
        Thread t = new Thread(new AsyncRun());
        t.start();
        System.out.println("main on thread " + Thread.currentThread().getId());
        throw new NullPointerException();
        }
        catch (Exception ex) {
            System.out.println(ex.getClass().getName() + " handled");
        }
        
    }
}
