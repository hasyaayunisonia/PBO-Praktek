/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */

public class Employee {
    
    private LinkedList<Chef> listChef;
    
    public LinkedList<Chef> getListChef() {
        return listChef;
    }
    
    public void setListChef(LinkedList<Chef> listChef) {
        this.listChef = listChef;
    }
}
