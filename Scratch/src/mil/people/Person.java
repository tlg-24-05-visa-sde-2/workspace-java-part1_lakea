package mil.people;/*
* An immutable class.
* That is, a class definition written in such a way that instance of it (Person objects),
* once created, cannot have their own properties changed.
* There are simply no public methods to do so, i.e., getters, but NO setters
 */

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    /*
    *Returns the person's name in whole years.
    * This is a period of time between the birthdate and today's date
    * This is a "derived" property, it's calculated from existing data, not a new field.
     */
    public int currentAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }



    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", name(), birthDate());
    }
}