import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Functiontest {
    @Test
    public void tesIsFive() {
        int i = Functions.sum(6, 5);
        Assertions.assertEquals(12, i);
    }
    @Test
    public void tesPow() {
        int i = Functions.sub(6, 5);
        Assertions.assertEquals(1, i);
    }
    @Test
    public void testConcat() {
        int i = Functions.mul(6, 5);
        Assertions.assertEquals(30, i);
    }
}