package org.snooze;

/*
* Client side main class focused only on testing setSnoozeInterval().
*We will do BVT (Boundary Value Testing):
*Any BUGs will be sniffed out on the edges of the valid range.
*We test 0,1 and 20,21
* We test on each boundary and just outside of it
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);     // value should take the 1 with no error message
        System.out.println(clock);

        clock.setSnoozeInterval(20);   // value should take the 20 with no error message
        System.out.println(clock);

        clock.setSnoozeInterval(0);     // error message, value rejected (so it's still 20)
        System.out.println(clock);
        System.out.println();

        clock.setSnoozeInterval(21);     // error message, value rejected (so it's still 20)
        System.out.println(clock);
    }
}