/*
 * Application or system class model the workings of a television
 * it has properties/attributes and business methods but no main() method
 */
class Television {
    // class-level "static" variables - these live in the "shared area" above the instances, ALL_CAP naming
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public Television(String brand, int volume) {

    }

    public static int getInstanceCount() {
        return instanceCount;
        // boolean isConnected = verifyInternetConnection();
        // ^^^ cannot be called here bc static methods can't directly call instance methods
        // w/o having a reference to a specific instance (object)
    }
    // ______________________________________________________________________________________________________

    // properties or attributes - "fields" or "instance variables"
    // default values when values are not specified
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;            // for muting behavior
    private int oldVolume;              // for muting behavior

    // constructors - these get called when the client says "NEW"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();         // delegate to no argument constructor above for the increment
        setBrand(brand);    // delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // functions or operations - "methods"
    // business or "action" methods

    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();
        // System.out.println(verifyInternetConnection());
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Turning off... goodbye!");
    }

    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        public void setBrand(String brand) {
            switch (brand) {
                case "Samsung":
                case "LG":
                case "Sony":
                case "Toshiba":
                    this.brand = brand;
                    break;
                default:
                    System.out.println("Invalid brand: " + brand + "." +
                            " Valid brands are: Samsung, LG, Sony, Toshiba.");
            }
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
       if (MIN_VOLUME <= volume && <= MAX_VOLUME) {
           this.volume = volume;
           isMuted = false;         // clear the isMuted flag in case we were muted
        }
       else {
            System.out.println("Invalid volume: " + volume + ". " +
                    "Valid range is " + MIN_VOLUME + " to " + MAX_VOLUME + " (inclusive).");
        }
    }
public DisplayType getDisplay() {
        return display;
}
public void setDisplay(DisplayType display) {
        this.display = display;
}
  public boolean() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    //toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume())
        return "Television: brand=" + getBrand() + ", volume=" + volumeString +
                ", display=" + getDisplay();
    }
}
