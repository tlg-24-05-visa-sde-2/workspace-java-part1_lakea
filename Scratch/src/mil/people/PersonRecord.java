package mil.people;

import java.time.LocalDate;
import java.time.Period;

public record PersonRecord(String name, LocalDate birthDate) {

    public int age() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }
}
