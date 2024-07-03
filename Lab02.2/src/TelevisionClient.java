/*
 * Application main class
 * In the main() method we will create a few tv objects and give them a test drive
 */
class TelevisionClient {
    //entry point
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();


        // create instance of Television, set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        // create 2nd instance of Television using its brand volume display constructor
        Television tv2 = new Television("Sony", 50, DisplayType.OLED);

        // create 3rd Television object, and give it the maximum volume
        Television tv3 = new Television("LG", Television.MAX_VOLUME);  // CRANK IT UP!!

        // turn them all on and off
        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        // calling the toString()
        System.out.println(tv1.toString());
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances");
    }
}