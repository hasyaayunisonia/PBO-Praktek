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

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            ArrayList<Order> barang = gson.fromJson( 
                new FileReader("G:\\POLBAN\\3\\PBO P(Pemrograman Berorientasi Objek)\\Pertemuan 12\\Pertemuan 12\\src\\pertemuan12\\barang.json"),
                new TypeToken<ArrayList<Order>>() {}.getType()
            );
            for(int a=0;a<barang.size();a++) {
                System.out.println("Barang ke-" + (a+1) + " = " + barang.get(a).toString());
            }
        } catch(JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
