import java.util.Arrays;

public class TasksFunctions {

    public static boolean isGreaterThanSeven(int number) {
        return number > 7;
    }

    public static boolean isJohn(String name) {
        return "John".equals(name);
    }

    public static int[] getMultiplesOfThree(int[] array) {
        return Arrays.stream(array)
                .filter(number -> number % 3 == 0)
                .toArray();
    }
}
