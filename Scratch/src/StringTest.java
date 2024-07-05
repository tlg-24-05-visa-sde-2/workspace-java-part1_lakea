class StringTest {
    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        System.out.println(city1 == city2);     // this is WRONG
        System.out.println(city1.equals(city2));        // this is the correct and ONLY way to do it

        String city1new = city1.substring(0,3);     // returns new
        String city2new = city2.substring(0,3);     // returns new

        System.out.println(city1new == city2new);       //WRONG
        System.out.println(city1new.equals(city2new));      // ONLY WAY TO DO IT
        System.out.println();

        // in WA state, license plates are like "637YOC"
        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{3}\\d{4}";
        String plate1 = "637YOC";
        System.out.println(plate1.matches(pattern));

        String plate2 = "AAS1134";
        System.out.println(plate2.matches(pattern));
        System.out.println();

        String poem = """
                Roses are red
                Violets are blue
                Sugar is "sweet"
                And so are YOU!
                """;
        System.out.println(poem);

    }

}