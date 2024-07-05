import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Nova", LocalDate.of(2024, 03, 18));
        System.out.println(p1);
    }
}