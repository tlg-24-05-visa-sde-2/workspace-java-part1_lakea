package mil.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Nova", LocalDate.of(2024, 03, 18));

        System.out.printf("%s is %s years old\n", p1.name(), p1.currentAge());
        System.out.println(p1);
    }
}