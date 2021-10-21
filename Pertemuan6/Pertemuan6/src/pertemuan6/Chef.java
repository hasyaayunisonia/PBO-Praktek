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
public class Chef {
    private String nameChef;
    
    public Chef (String nameChef) {
        this.nameChef = nameChef;
    } 
    
    public String getChefName() {
        return nameChef;
    }
    
    public void setChefName (String nameChef) {
        this.nameChef = nameChef;
    }
}
