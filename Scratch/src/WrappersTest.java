class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "27";
        int age = Integer.parseInt(ageInput);       // returns int 27 from string "27"
        Integer ageInteger = Integer.valueOf(ageInput);     // returns Integer(57) from "27"

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);

        String priceInput = "12.49";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String isSunnyInput = "true";
        boolean isSunny = Boolean.parseBoolean(isSunnyInput);
        Boolean isSunnyBoolean = Boolean.valueOf(isSunnyInput);
    }
}