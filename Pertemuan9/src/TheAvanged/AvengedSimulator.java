/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAvanged;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */

public class AvengedSimulator {
    public static void main(String[] args) {
        SuperHero h1 = new FlyingDutchMan("Shirai", 225);
        SuperHero h2 = new ManRay("Gennichiro", 0);
        SuperHero h3 = new ManRay("Gyoubu Masataka Oniwa", 553);
        SuperHero h4 = new DirtyBubble("Arnastria", 666);
        SuperHero h5 = new FlyingDutchMan("Tatenari", 36556);

        List<SuperHero> listHero = new ArrayList<>();
        listHero.add(h1);
        listHero.add(h2);
        listHero.add(h3);
        listHero.add(h4);
        listHero.add(h5);
        
        Collections.sort(listHero);
        for(SuperHero superhero : listHero) {
            System.out.println("====================================");
            superhero.identity();
            System.out.println();
            superhero.showPowers();
            System.out.println("====================================");
        }   
    }
}
