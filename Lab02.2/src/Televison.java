/*
*Application or system class to model the workings of a television.
*It has properties/attributes, it has business methods, but NO main() method.
*/
class Televison {
    //properties or attributes - "fields" or "instance variables"
    String brand = "Toshiba"; //Default volume when not specified
    int volume = 1;

    // functions or operations - "methods"
    void turnOn() {
        System.out.println("Turning on you " +brand + " television to volume " + volume);
    }
    void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

}
