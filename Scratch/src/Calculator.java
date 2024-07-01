class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
    * Returns a random integer between min and max (inclusive).
     */
    int randomInt(int min, int max) {  // min: 5, max: 16
        int result = 0;

        double rand = Math.random();    //0.0000 to 0.9999
        double scaled = (rand * (max - min + 1));   // 0.0000 to 15.9999
        double lifted = scaled + min;               // 5.0000 to 16.9999
        result = (int) lifted;

        return result;
    }

    /*
    * Returns A random integer between 1 and 11 (inclusive).
    */
  int randomInt(int max) {
      return randomInt(1, max);     // delegate to min-max version, passing 1 and max
  }
    /* HINT:see a class called Math (in package java.lang), look for a helpful method here.
    * NOTE: these methods are all "static", which means you call them as follows:
    *   Math.methodName()
     */
    int randomInt() {
        return randomInt(1,11);     // delegate to min-max version, passing 1 for min, 11 for max
//        int result = 0;
//
//        double rand = Math.random();         // 0.0000 to 0.9999
//        double scaled = (rand * 11) + 1;    //1.0000 to 11.9999
//        result = (int) scaled;              // explicit convert from double to int
//
//
//        return result;
    }

}