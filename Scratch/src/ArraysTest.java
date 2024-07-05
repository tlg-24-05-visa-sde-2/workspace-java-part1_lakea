import java.lang.reflect.Array;
import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages [0] = 27;
        ages [1] = 57;
        ages [2] = 52;
        ages [3] = 14;
        System.out.println(Arrays.toString(ages));
        System.out.println();

        double[] temps = { 82.3, 97.2, 130.2, 95.0, 86.0};
        System.out.println(Arrays.toString(temps));

        for (double temp : temps) {
            System.out.printf("The temperature is: %s\n", (temp));
        }
        System.out.println();

        String[] cities = {"Atlanta", "St.Louis", "New Orleans", "Miami"};
        System.out.println(Arrays.toString(cities));

        for (String city : cities) {
            System.out.println("I live in " + city);
        }
    }

}