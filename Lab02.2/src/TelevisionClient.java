/*
*Application main-class
* in the main() method, we will create a few Televison objects and give them a basic test drive
 */
class TelevisionClient {

    public static void main(String[] args) {
        // create an instance of television and set its properties
        Televison tv1 = new Televison();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        // create a second instance of Television and set its properties also
        Televison tv2 = new Televison();
        tv2.setBrand("Sony");
        tv2.setVolume(50);

        //Create a 3rd television object but DON'T set its propeties
        Televison tv3 = new Televison();

        tv1.turnOn();
        tv1.turnOff();
        // tv1.connectedToInternet():
        System.out.println(tv1.toString()); //automatically called
        System.out.println();


        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);
        System.out.println();


        tv3.turnOn();
        tv3.turnOff();
        System.out.println(tv3);
        System.out.println();



    }
}
