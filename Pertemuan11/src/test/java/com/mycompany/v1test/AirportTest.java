/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.v1test;


/**
 *
 * @author Asus
 */

//import com.mycompany.v1.Passenger;
//import com.mycompany.v1.Flight;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.TestFactory;

import com.mycompany.v1.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.*;

//public class AirportTest {
//    
//    private Flight economyFlight;
//
//    @Before
//    public void setUp() throws Exception {
//        economyFlight = new Flight("1", "Economy");
//    }
//
//    @Test
//    public void testEconomyFlightRegularPassenger() {
//        Passenger mike = new Passenger("Mike", false);
//        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(mike));
//        assertEquals(1, economyFlight.getPassengersList().size());
//        assertEquals("Mike",economyFlight.getPassengersList().get(0).getName());
//        assertEquals(true, economyFlight.removePassenger(mike));
//        assertEquals(0, economyFlight.getPassengersList().size());
//    }
//
//    @Test
//    public void testEconomyFlightVipPassenger() {
//        Passenger james = new Passenger("James", true);
//        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(james));
//        assertEquals(1, economyFlight.getPassengersList().size());
//        assertEquals("James", economyFlight.getPassengersList().get(0).getName());
//        assertEquals(false, economyFlight.removePassenger(james));
//        assertEquals(1, economyFlight.getPassengersList().size());
//    }
//}   

public class AirportTest {
    
    private Flight businessFlight;

    @Before
    public void setUp() throws Exception {
        businessFlight = new Flight("2", "Business");
    }

    @Test
    public void testBusinessFlightRegularPassenger() {
        Passenger mike = new Passenger("Mike", false);
        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
    }

    @Test
    public void testBusinessFlightVipPassenger() {
        Passenger james = new Passenger("James", true);
        assertEquals(true, businessFlight.addPassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
    }
}

//public class AirportTest {
//    
//    private Flight businessFlight, economyFlight;
//
//    @Before
//    public void setUp() throws Exception {
//        economyFlight = new Flight("1", "Economy");
//        businessFlight = new Flight("2", "Business");
//    }
//
//    @Test
//    public void testEconomyFlightRegularPassenger() {
//        Passenger mike = new Passenger("Mike", false);
//        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(mike));
//        assertEquals(1, economyFlight.getPassengersList().size());
//        assertEquals("Mike",
//        economyFlight.getPassengersList().get(0).getName());
//        assertEquals(true, economyFlight.removePassenger(mike));
//        assertEquals(0, economyFlight.getPassengersList().size());
//    }
//
//    @Test
//    public void testEconomyFlightVipPassenger() {
//        Passenger james = new Passenger("James", true);
//        assertEquals("1", economyFlight.getId());
//        assertEquals(true, economyFlight.addPassenger(james));
//        assertEquals(1, economyFlight.getPassengersList().size());
//        assertEquals("James",
//        economyFlight.getPassengersList().get(0).getName());
//        assertEquals(false, economyFlight.removePassenger(james));
//        assertEquals(1, economyFlight.getPassengersList().size());
//    }
//
//    @Test
//    public void testBusinessFlightRegularPassenger() {
//        Passenger mike = new Passenger("Mike", false);
//        assertEquals(false, businessFlight.addPassenger(mike));
//        assertEquals(0, businessFlight.getPassengersList().size());
//        assertEquals(false, businessFlight.removePassenger(mike));
//        assertEquals(0, businessFlight.getPassengersList().size());
//    }
//
//    @Test
//    public void testBusinessFlightVipPassenger() {
//        Passenger james = new Passenger("James", true);
//        assertEquals(true, businessFlight.addPassenger(james));
//        assertEquals(1, businessFlight.getPassengersList().size());
//        assertEquals(false, businessFlight.removePassenger(james));
//        assertEquals(1, businessFlight.getPassengersList().size());
//    }
//        
//}

/* E.	Listing 20.5 Testing the business logic for an economic flight */
//public class AirportTest {
//    @DisplayName("Given there is an economy flight") 
//    @Nested 
//        class EconomyFlightTest { 
//            private Flight economyFlight; 
//            
//            @BeforeEach
//            void setUp() { 
//                economyFlight = new Flight("1", "Economy"); 
//            } 
//            
//            @Test
//            public void testEconomyFlightRegularPassenger() {
//                Passenger mike = new Passenger("Mike", false); 
//                
//                assertEquals("1", economyFlight.getId()); 
//                assertEquals(true, economyFlight.addPassenger(mike)); 
//                assertEquals(1, economyFlight.getPassengersList().size()); 
//                assertEquals("Mike", economyFlight.getPassengersList().get(0).getName()); 
//                assertEquals(true, economyFlight.removePassenger(mike)); 
//                assertEquals(0, economyFlight.getPassengersList().size()); 
//            }
//            
//            @Test
//            public void testEconomyFlightVipPassenger() {
//                Passenger james = new Passenger("James", true); 
//                
//                assertEquals("1", economyFlight.getId()); 
//                assertEquals(true, economyFlight.addPassenger(james)); 
//                assertEquals(1, economyFlight.getPassengersList().size()); 
//                assertEquals("James", economyFlight.getPassengersList().get(0).getName()); 
//                
//                assertEquals(false, economyFlight.removePassenger(james)); 
//                assertEquals(1, economyFlight.getPassengersList().size()); 
//            }
//        }
//}

/* F.	Listing 20.6 Testing the business logic for an business flight */
//public class AirportTest {
////    private final Airport airport = new Airport();
////     private Airport Airport;
////     private Flight Flight;
////     private Passenger Passenger;
//    
//    @DisplayName("Given there is a business flight")
//    @Nested
//    class BussinessFlightTest {
//        
//        private Flight businessFlight;                                    
//        
//        @BeforeEach
//        void setUp() {
//            businessFlight = new Flight("2", "Business");
////            fail("The test case is a prototype.");
//        }
//        
////        @TestFactory
//        @Test
//        public void testBusinessFlightRegularPassenger() {
//            Passenger mike = new Passenger("Mike", false);
//            
//            assertEquals(false, businessFlight.addPassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
//            assertEquals(false, businessFlight.removePassenger(mike));
//            assertEquals(0, businessFlight.getPassengersList().size());
////            fail("The test case is a prototype.");
//        }
//        
//        @Test
////        @TestFactory
//        public void testBusinessFlightVipPassenger() {
//            Passenger james = new Passenger("James", true);
//            
//            assertEquals(true, businessFlight.addPassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
//            assertEquals(false, businessFlight.removePassenger(james));
//            assertEquals(1, businessFlight.getPassengersList().size());
////            fail("The test case is a prototype.");
//        } 
//    }
//}


