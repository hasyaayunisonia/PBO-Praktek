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

class TukarNilai {
    private Object nilai1;
    private Object nilai2;
    private Object temp;
    
    public void setNilai1(Object nilai1) {
        this.nilai1 = nilai1;
    }
    
    public Object getNilai1() {
        return nilai1;
    }
    
    public void setNilai2(Object nilai2) {
        this.nilai2 = nilai2;
    }
    
    public Object getNilai2() {
        return nilai2;
    }
    
    public void tukarNilai() {
        temp = nilai1;
        nilai1 = nilai2;
        nilai2 = temp;
        
        System.out.println("Nilai variabel nilai1 setelah ditukar adalah " + nilai1);
        System.out.println("Nilai variabel nilai2 setelah ditukar adalah " + nilai2);
    }
}

public class GenericClassTypeObject {
    public static void main(String[] args) {
        System.out.println(" ---Tipe data Integer--- ");
        TukarNilai tukartipedatainteger = new TukarNilai();
        tukartipedatainteger.setNilai1(24);
        tukartipedatainteger.setNilai2(6);
        tukartipedatainteger.tukarNilai();
        
        System.out.println(" ---Tipe data String--- ");
        TukarNilai tukartipedatastring = new TukarNilai();
        tukartipedatastring.setNilai1("Styles");
        tukartipedatastring.setNilai2("Swift");
        tukartipedatastring.tukarNilai();
    }
}
