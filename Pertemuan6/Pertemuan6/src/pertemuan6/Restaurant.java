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
public class Restaurant {
    private String name;
    private String nameChef;
    
    public Restaurant(String name) {
        this.name = name;
    }
    
    public String getRestaurantName() {
        return name;
    }
    
    public void setRestaurantName (String name) {
        this.name = name;
    }
    
    public String getChefName() {
        return nameChef;
    }
    
    public void setChefName (String nameChef) {
        this.nameChef = nameChef;
    }
}
