/*
*Application or system class to model the workings of a television.
*It has properties/attributes, it has business methods, but NO main() method.
*/
class Television {
    // class-level "static" variable - these live in the "shared-area
    //properties or attributes - "fields" or "instance variables"
    String brand = "Samsung"; //Default volume when not specified
    int volume = 15;

    // constructor - these get turned on when the client says new
    public Television(String brand, int volume) {
        this();
        setBrand(brand);
        setVolume(volume);

    }

    // functions or operations - "methods"
    public void turnOn() {
        boolean isConnected = connectToInternet();
        System.out.println("Turning on you " +brand + " television and setting volume to " + volume);
    }
    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    private boolean connectToInternet() {
        return true;
    }

    // accessor methods - getters, setters, toString
    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {

        return volume; }

    public String toString() {
        return "Television: " +
                "Brand = " + brand +
                ", Volume = " + volume;
    }

    public void setVolume(int i) {

    }
}
