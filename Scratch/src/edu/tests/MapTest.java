package edu.tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();    // Map of KV ----- K: String, V: Double

        gpaMap.put("Kea", 4.0);
        gpaMap.put("Sherie", 3.84);
        gpaMap.put("Jasmine", 3.6);
        gpaMap.put("DeShon", 2.5);
        gpaMap.put("Cortney", 3.76);
        gpaMap.put("Kelvin", 1.7);

        Double keaGpa = gpaMap.get("Kea");
        System.out.println("Kea's GPA was: " + keaGpa);
        System.out.println();


        dump(gpaMap);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();  // returns Collection<V> i.e. Collection<Double>
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
            }
        }
        System.out.println();

        // print all names of those with GPA of 2.5 or greater
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 2.5) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();

    }

    private static void dump(Map<String, Double> gpaMap) {
        for(Map.Entry<String,Double> entry : gpaMap.entrySet()) {   //collection of the "rows"
            System.out.println(entry.getKey() + " | " + entry.getValue());

        }
    }

}