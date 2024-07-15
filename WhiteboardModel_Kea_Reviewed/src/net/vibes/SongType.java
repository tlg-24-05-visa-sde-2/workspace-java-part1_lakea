package net.vibes;

/**
 * JR: formatting (tabbing) is off.  Ctrl+Alt+L will line it all up for you.
 * Code cleanliness is important.
 * As we did in class, if configuring a custom display-string, add the toString() method, also.
 *
 * Better name = Genre.
 */
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
