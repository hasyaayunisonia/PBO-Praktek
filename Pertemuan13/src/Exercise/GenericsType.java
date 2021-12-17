/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

/**
 *
 * @author Asus
 */
public class GenericsType <T> {
    private T t;
    
    public T get() {
        return this.t;
    }
    
    public void set(T t1) {
        this.t = t1;
    }
    
    public static void main(String[] args) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Java");
        
        /* check */
//        String str = type.get();
//        System.out.println(str);
        
        GenericsType type1 = new GenericsType();
        type1.set("Java");
        /* check */
//        String str1 = (String) type1.get();
//        System.out.println(str1);
         
        type1.set(10);
        /* check */
//        int integer = (int) type1.get();
//        System.out.println(integer);
    }
}
