class TelevisionValidation {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);            // should stick
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(100);
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println("volume: " + tv.getVolume());

        System.out.println();

Television Tv = new Television();
        Tv.setBrand("Samsung");
        System.out.println("brand: " + Tv.getBrand());

        Tv.setBrand("LG");
        System.out.println("brand: " + Tv.getBrand());

        Tv.setBrand("Sony");
        System.out.println("brand: " + Tv.getBrand());

        Tv.setBrand("Toshiba");
        System.out.println("brand: " + Tv.getBrand());

        Tv.setBrand("INVALID");
        System.out.println("brand: " + Tv.getBrand());
    }
}