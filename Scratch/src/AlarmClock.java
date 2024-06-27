/*
*Application class to model the workings of an AlarmClock.
* This class will not have a main() method, most such classes do not.
 */

class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields" in Java
    int snoozeInterval = 5; //This is the default value when client doesn't specify one (instead of 0)

    // functions or operations - these are called "methods" in Java
    void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }
}
