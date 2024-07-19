package com.LuxuryCar.client;

import com.LuxuryCar.LuxuryCar;

import static com.LuxuryCar.Body.COUPE;
import static com.LuxuryCar.Body.SEDAN;

class LuxuryCarClient {
    public static void main(String[] args) {

        LuxuryCar lc1 = new LuxuryCar("BMW", "M5",SEDAN,2019, 200);
        LuxuryCar lc2 = new LuxuryCar("Mercedes", "AMG GLE_53",COUPE,2023, 200);

        System.out.println(lc1);
        System.out.println(lc2);

        System.out.println();

        lc1.turnOn();
        lc2.turnOn();

        System.out.println();

        lc1.accelerate(142);
        lc2.accelerate(60);

        System.out.println();

        lc1.turnOff();
        lc2.turnOff();

        System.out.println();
    }

}