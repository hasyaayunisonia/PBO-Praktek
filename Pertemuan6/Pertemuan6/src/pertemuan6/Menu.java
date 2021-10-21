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
public class Menu {
    private String nameMenu;
    private int price;
    
    public Menu(String namemenu, int price) {
        this.nameMenu = namemenu;
        this.price = price;
    }
    
    public void setMenu(String nameMenu){
         this.nameMenu = nameMenu;
    }
     
    public String getMenu() {
        return nameMenu;
    }
    
    public void setPrice(int price){
         this.price = price;
    }
     
    public int getPrice() {
        return price;
    }
}
