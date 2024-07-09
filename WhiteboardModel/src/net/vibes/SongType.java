package net.vibes;

public enum SongType {
    R_AND_B("R&B"),
    RAP("Rap"),
    OLD_SCHOOL("Old School");

        // everything under here is regular class definition stuff - fields, ctors, methods
        private final String display;

        SongType(String display) {
        this.display = display;
    }
        public String getDisplay() {
        return display;
    }

}
