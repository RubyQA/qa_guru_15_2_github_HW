import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class exampleTest {
    @Test
    void exampleTest(){
        Assertions.assertTrue(new Random().nextInt()>1);
    }

    @Test
    void exampleTest1(){
        Assertions.assertTrue(3 == 3);
    }
}
