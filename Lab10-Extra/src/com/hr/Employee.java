package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     *  OPTION 4: try-catch, and throw a different one back at client
     */
    public void goToWork() throws WorkException {
        Car c = new Car("WBSJF0C52KB285746", "BMW", "M5");
        try {
            c.start();
            c.moveTo("Buckhead");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e); // include the nested 'cause'
        }
        finally {
            c.stop();
        }
    }

    /*
     * OPTION 3: try-catch react/respond in some way then rethrow the exception back to my client
     */
//    public void goToWork() {
//            Car c = new Car("WBSJF0C52KB285746", "BMW", "M5");
//
//            try {
//            c.start();
//            c.moveTo("Buckhead");
//            }
//
//            catch (DestinationUnreachableException e) {
//            System.out.println(e);
//        }
//        finally {
//            c.stop();
//        }
//    }
    /*
     * OPTION 2: "punt," means to ignore the exception we are not dealing with it
     * NOTE: it is critical that stop() gets called no matter what
     */

//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("WBSJF0C52KB285746", "BMW", "M5");
//
//        try {
//            c.start();
//            c.moveTo("Buckhead");
//        }
//        finally {
//            c.stop();
//        }
//
//    }

    /*
     * OPTION 1: try-catch and handle
     * NOTE: it is Critical that stop() gets called no matter what
     */
//    public void goToWork() {
//            Car c = new Car("WBSJF0C52KB285746", "BMW", "M5");
//
//            try {
//            c.start();
//            c.moveTo("Buckhead");
//            }
//
//            catch (DestinationUnreachableException e) {
//            System.out.println(e);
//        }
//        finally {
//            c.stop();
//        }
//    }


    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}