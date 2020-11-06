import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @org.junit.jupiter.api.Test
    void randomBoyName() {
        Algorithms1 a = new Algorithms1();
        assertEquals("Awesome", a.randomBoyName());
    }

    @Test
    void randomName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(10);
    }
}