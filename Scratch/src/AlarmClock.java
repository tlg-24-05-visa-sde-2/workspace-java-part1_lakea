/*
*Application class to model the workings of an AlarmClock.
* This class will not have a main() method, most such classes do not.
 */

class AlarmClock {
    // properties or attributes - these are called "instance variables" or "fields" in Java
   private int snoozeInterval = 5; //This is the default value when client doesn't specify one (instead of 0)

    // functions or operations - these are called "methods" in Java
   public void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");
    }
// accessor methods - provide controlled access to the object's field
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: implement constraint - must be between 1 and 20 (inclusive)
    // if the incoming value is valid we take it, i.e., assign to the private field
    // otherwise reject it with an error message
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;
    }

    /*
    *Purpose: return a string (sentence) describing this object.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval=" + snoozeInterval;
    }
}
