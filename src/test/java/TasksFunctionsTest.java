import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksFunctionsTest {

    @Test
    void shouldReturnTrueWhenNumberIsGreaterThan7(){
        assertTrue(TasksFunctions.isGreaterThanSeven(8));
    }

    @Test
    void shouldReturnFalseWhenNumberIsLessThanSeven() {
        assertFalse(TasksFunctions.isGreaterThanSeven(5));
    }

    @Test
    void shouldReturnFalseWhenNumberIsEqualToSeven() {
        assertFalse(TasksFunctions.isGreaterThanSeven(7));
    }

    @Test
    void shouldRecognizeJohn() {
        assertTrue(TasksFunctions.isJohn("John"));
    }

    @Test
    void shouldRejectAnotherName() {
        assertFalse(TasksFunctions.isJohn("Mike"));
    }

    @Test
    void shouldBeCaseSensitive() {
        assertFalse(TasksFunctions.isJohn("john"));
    }

    @Test
    void shouldReturnMultiplesOfThree() {

        int[] input = {1, 3, 6, 8, 9, 10};

        int[] result = TasksFunctions.getMultiplesOfThree(input);

        assertArrayEquals(
                new int[]{3, 6, 9},
                result
        );
    }

    @Test
    void shouldReturnEmptyArrayWhenNoMultiplesExist() {

        int[] input = {1, 2, 4, 5};

        int[] result = TasksFunctions.getMultiplesOfThree(input);

        assertArrayEquals(
                new int[]{},
                result
        );
    }
}
