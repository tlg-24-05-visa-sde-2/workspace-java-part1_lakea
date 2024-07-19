package com.LuxuryCar.test;

import com.LuxuryCar.LuxuryCar;

class LuxuryCarValidationTest {
    public static void main(String[] args) {
        LuxuryCar lc1 = new LuxuryCar();

        lc1.accelerate(201);        // should be invalid MAX_SPEED is 200
        lc1.accelerate(-2);         // should ALSO be invalid MIN_SPEED is 0.

        System.out.println();


        lc1.accelerate(100);        // should be valid MAX_SPEED is 200

        System.out.println("Current speed: " + lc1.getMph() + " mph.");
    }
}