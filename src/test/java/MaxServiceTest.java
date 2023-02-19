import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxServiceTest {

    @Test
    public void findMax(){
        MaxService maxService=new MaxService();
        int a=5;
        int b=3;
        int expected=5;
        assertEquals(expected,maxService.max(a,b));

    }
    @Test
    public void findMax1(){
        MaxService maxService=new MaxService();
        int a=4;
        int b=6;
        int expected=6;
        assertEquals(expected,maxService.max(a,b));

    }
}