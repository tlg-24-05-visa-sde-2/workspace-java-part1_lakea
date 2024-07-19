package com.LuxuryCar.client;

import com.LuxuryCar.Body;
import com.LuxuryCar.LuxuryCar;

import java.util.Arrays;

class LuxuryCarClientArgs {
    public static void main(String[] args) {
        if (args.length <5) {
            String usage = "USAGE: <make>, <model>, <body>, <year>, <dash>\n";
            String note = "NOTE: Need to have a minimum of FIVE arguments\n";
            String example = "EXAMPLE: MERCEDES GLE 53 COUPE 2024 200\n";
            String note2 = "NOTE2: Body types are limited to " + Arrays.asList(Body.values());

            System.out.println(usage + note + example + note2);
        }
        else {
            LuxuryCar lc1 = new LuxuryCar(args[0],args[1],
                    Body.valueOf(args[2].toUpperCase()),
                    Integer.valueOf(args[3]),
                    Integer.valueOf(args[4]));

            System.out.println(lc1);
        }
    }

}