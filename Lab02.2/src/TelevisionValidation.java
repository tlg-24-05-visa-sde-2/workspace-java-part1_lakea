class TelevisionValidation {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(0);            // should stick
        System.out.println("volume: " + tv1.getVolume());

        tv1.setVolume(100);
        System.out.println("volume: " + tv1.getVolume());

        tv1.setVolume(-1);
        System.out.println("volume: " + tv1.getVolume());            //error because value is not valid


        tv1.setVolume(101);
        System.out.println("volume: " + tv1.getVolume());

        System.out.println();

        Television tv2 = new Television();

        tv2.setVolume(0);            // should stick
        System.out.println("volume: " + tv1.getVolume());

        tv2.setVolume(100);
        System.out.println("volume: " + tv1.getVolume());

        tv2.setVolume(-1);
        System.out.println("volume: " + tv1.getVolume());            //error because value is not valid


        tv2.setVolume(101);
        System.out.println("volume: " + tv1.getVolume());

        System.out.println();

    }
}