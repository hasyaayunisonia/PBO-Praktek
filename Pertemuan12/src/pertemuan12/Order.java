/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

/**
 *
 * @author Asus
 */

public class Order {
    /* Attributes*/
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private long weight;
    private long quantity;
    private long priceItem;
    private String productName;
    
    /* Methods */
    @Override
    public String toString() {
        return productName + " | " + quantity + " | " + weight + " | "
                + city.getDestination() + " | " + servicePackage.getService() + 
                " | " + servicePackage.getValue() + " | " + 
                ((quantity*priceItem) + servicePackage.getValue());
    }
}








































