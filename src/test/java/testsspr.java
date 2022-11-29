import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testsspr {
    @Test
    public void test(){
        int i = Functions.sum(15,5);
        assertEquals(20, i);
    }

    @Test
    public void test2(){
        int i = Functions.sub(15,5);
        assertEquals(10, i);
    }

    @Test
    public void test3(){
        int i = Functions.mul(15,5);
        assertEquals(75, i);
    }

    @Test
    public void test4(){
        int i = (int) Functions.div(15,5);
        assertEquals(3, i);
    }
}
