/*
*Application main-class
* in the main() method, we will create a few Televison objects and give them a basic test drive
 */
class TelevisionClient {

    public static void main(String[] args) {
        // create an instance of television and set its properties
        Televison tv1 = new Televison();
        tv1.brand = "Samsung";
        tv1.volume = 32;

        // create a second instance of Television and set its properties also
        Televison tv2 = new Televison();
        tv2.brand = "Sony";
        tv2.volume = 50;

        //Create a 3rd television object but DON'T set its propeties
        Televison tv3 = new Televison();

        //turn them all on
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        //turn them all off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

    }
}
