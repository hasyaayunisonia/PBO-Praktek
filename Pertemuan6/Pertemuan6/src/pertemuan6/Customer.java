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

//import java.util.List;

public class Customer {
    private String nameCustomer;
    private Menu menu;
    
    public void setCustomerName(String nameCustomer){
         this.nameCustomer = nameCustomer;
    }
     
    public String getCustomerName() {
        return nameCustomer;
    }
    
    public Customer (String nameCustomer, Menu menu) {
        this.nameCustomer = nameCustomer;
        this.menu = menu;
    }
    
    public String toString() {
        return  "Pemesan \t: " + this.nameCustomer + 
                "\nMenu Pesanan \t: " + this.menu.getMenu() + 
                "\nHarga \t\t: " + this.menu.getPrice(); 
    }
    
    public void Message(Chef chef) {
        System.out.println("Chef  \t\t: " + chef.getChefName());
    }
}
