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
        clock1.snoozeInterval = 7;

        // create a 2nd AlarmClock and set its snoozeInterval also
        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        // create a 3rd alarm clock object, but this time DON'T give it a snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        //make them snooze()
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
    }
}
