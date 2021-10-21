/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Asus
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        /* Asosiasi */
        Restaurant resto = new Restaurant("Zella Day");
        Chef chef1 = new Chef("Juna");
        resto.setChefName(chef1.getChefName());
        System.out.println("Restoran " + resto.getRestaurantName() + 
           " mempunyai Chef bernama " + resto.getChefName());
        
        /* Agregasi */
        Employee emp = new Employee();        
        LinkedList<Chef> listChef = new LinkedList<>();
        
        listChef.add(new Chef("Juna"));
        listChef.add(new Chef("Renata"));
        listChef.add(new Chef("Arnold"));
        emp.setListChef(listChef);
        
        System.out.println("=== List Karyawan ===");
         for (Chef employee : listChef) {
            System.out.println("-" + employee.getChefName()); 
         }
         
         /* Komposisi */
         Menu menu1 = new Menu("Lasagna", 75000);
         Customer cust1 = new Customer("Hasya", menu1);
         System.out.println("==== Pesanan ====");
         System.out.println(cust1);
         
         /* Dependence */
         Chef c_dependence = new Chef("Arnold");
         cust1.Message(c_dependence);
    }
}
