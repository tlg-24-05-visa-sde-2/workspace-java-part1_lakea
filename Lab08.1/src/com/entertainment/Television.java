package com.entertainment;

import java.util.Arrays;

/*
 * Application or system class model the workings of a television
 * it has properties/attributes and business methods but no main() method
 */
public class Television {
    // class-level "static" variables - these live in the "shared area" above the instances, ALL_CAP naming
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // DISCLAIMER: the proper way would be to use a Brand enum
    // We will do it this way for labs, just for practive with arrays and loops
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;


    // this method is also "up there" in the shared zone, it doesn't execute inside a Television
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Recall: all static methods are called as Television,methodName()
    //in this case that means Television.isValidBrand()
    public static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equals(brand)) {       // we have a match
                valid = true;
                break;      //no need to keep looking once brand is found
            }
        }
        return valid;
    }
    // ______________________________________________________________________________________________________

    // properties or attributes - "fields" or "instance variables"
    // default values when values are not specified
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;


    private boolean isMuted;  // for muting behavior
    private int oldVolume;    // for muting behavior

    // Television HAS a Tuner
    private final Tuner tuner = new Tuner(); // instantiated internally NOT exposed

    // constructors - these get called when the client says "NEW"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();         // delegate to no argument constructor above for the increment
        setBrand(brand);    // delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);        // delegate to the neighboring
        setVolume(volume);

    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);        //
        setDisplay(display);
    }


    // functions or operations - "methods"
    // business or "action" methods

    public void changeChannel(String channel) {
        tuner.setChannel(channel);      // delegate to contained Tuner object 'tuner'
    }

    public String getCurrentChannel() {
        return tuner.getChannel();      // delegate to contained Tuner object 'tuner'
    }

    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();

        // System.out.println(verifyInternetConnection());
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Turning off... goodbye!");
    }

    public void mute() {
        if (!isMuted())
            oldVolume = getVolume();
        volume = 0;
        isMuted = true;
    }

    //accessor methods
    public String getBrand() {
        return brand;
    }

    // DISCLAIMER: the proper way would be to use a Brand enum
    // We will do it this way for labs, just for practice with arrays and loops
    // VALID_BRANDS are "Samsung","LG", "Sony", "Toshiba"
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.printf("Invalid brand: %s. Valids brands are %s.\n",
                    brand, Arrays.toString(VALID_BRANDS));
        }
    }


    /*
    if (brand.equals("Samsung") ||
    brand.equals("LG") ||
    brand.equals("Sony") ||
    brand.equals("Toshiba")) {
    this.brand = brand;
    }
    else (
    System,out,println("Invalid brand: " + brand + "." +
    " Valid brands are: Samsung, LG, Sony, Toshiba.");
    }
     */
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;         // clear the isMuted flag in case we were muted
        } else {
            System.out.printf("Invalid volume: %s. Valid range is %s is %s (inclusive). \n",
                    volume, MIN_VOLUME, MAX_VOLUME);

            // System.out.println("Invalid volume: " + volume + ". " +
            // "Valid range is " + MIN_VOLUME + " to " + MAX_VOLUME + " (inclusive).");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s, currentChannel=%s",
                getBrand(), volumeString, getDisplay(), getCurrentChannel());
    }

//        return "Television: brand=" + getBrand() + ", volume=" + volumeString +
//                ", display=" + getDisplay();
//    }
};

