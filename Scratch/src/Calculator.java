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
    * TODO: implement this algorithm
     */
    int randomInt(int min, int max) {
        return 0;
    }

    /*
    * Returns A random integer between 1 and 11 (inclusive).
    *
    * HINT:msee a class called Math (in package java.lang), look for a helpful method here.
    * NOTE: these methods are all "static", which means you call them as follows:
    *   Math.methodName()
    *
    * int for the return type
    * randomNum()
    * random()
    *
    * randomInt()
    * randInt()
     */
    int randomInt() {
        int result = 0;

        double rand = Math.random(); // 0.0000 to 0.9999
        double scaled = (rand * 11) + 1; //1.0000 to 11.9999
        result = (int) scaled; // explicit convert from double to int
        return result;
    }

}