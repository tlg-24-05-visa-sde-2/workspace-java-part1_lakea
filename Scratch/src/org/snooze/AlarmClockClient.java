package org.snooze;

/*
*Client-side "main-class," i.e., the class definition with main().
* That's the ONLY thing in here.
* we will create a few AlarmClock objects and give them a basic test drive.
 */
class AlarmClockClient {

   // starting point or "entry" point for every standalone Java application
    public static void main(String[] args) {
        // create an instance (or object) of AlarmClock and set its snoozeInterval
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7); // this will not be allowed

        // create a 2nd AlarmClock via its snoozeInterval ctor (do ti in one shot)
        AlarmClock clock2 = new AlarmClock(10);


        // create a 3rd alarm clock object, and I want its snoozeInterval to be the largest possible
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        //make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        // show their toString() methods to action
        System.out.println(clock1.toString());
        System.out.println(clock2); //toString() automatically called
        System.out.println(clock3);
    }
}
