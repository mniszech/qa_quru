package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        Assertions.assertTrue(3 >= 9);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 >= 1);
    }
}
