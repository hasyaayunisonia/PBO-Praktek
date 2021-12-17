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

//Java Generic Interface
interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class Provinsi<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    
    public Provinsi(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class GenericInterfaceandMethod {
    //Java Generic Method
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return (p1.getKey().equals(p2.getKey())) && (p1.getValue().equals(p2.getValue()));
    }
    
    public static void main(String[] args) {

        Provinsi<String, String> prov = new Provinsi<>("Jawa Barat", "Bandung");
        Provinsi<String, String> prov1 = new Provinsi<>("Jawa Barat", "Bandung");
        boolean compare = GenericInterfaceandMethod.<String, String>compare(prov, prov1);
        String jawab;
        jawab = compare ? " iya " : " tidak";
        System.out.println("prov mempunyai " + "Key = " + prov.getKey() + " dan Value = " + prov.getValue());
        System.out.println("prov1 mempunyai " + "Key = " + prov1.getKey() + " dan Value = " + prov1.getValue()); 
        System.out.println("-> Apakah Key dan Value antara prov dengan prov1 sama?" + jawab + "\n");
        
        Provinsi<String, String> prov2 = new Provinsi<>("Jawa Barat", "Bdg");
        boolean compare2 = GenericInterfaceandMethod.<String, String>compare(prov, prov2);
        String jawab2;
        jawab2 = compare2 ? " iya " : " tidak";
        System.out.println("prov2 mempunyai " + "Key = " + prov2.getKey() + " dan Value = " + prov2.getValue()); 
        System.out.println("-> Apakah Key dan Value antara prov dengan prov2 sama?" + jawab2 + "\n");
        
        Provinsi<String, String> prov3 = new Provinsi<>("Jawa Timur", "Surabaya");
        boolean compare3 = GenericInterfaceandMethod.<String, String>compare(prov, prov3);
        String jawab3;
        jawab3 = compare3 ? " iya " : " tidak";
        System.out.println("prov3 mempunyai " + "Key = " + prov3.getKey() + " dan Value = " + prov3.getValue()); 
        System.out.println("-> Apakah Key dan Value antara prov dengan prov3 sama?" + jawab3 + "\n");
    }
}
