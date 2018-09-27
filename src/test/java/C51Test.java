import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C51Test {

    private C51 c51 = new C51();

    @Test
    void testM1(){
        assertEquals("m1",this.c51.m1());
    }

    @Test
    void testM2(){
        assertEquals("m2",this.c51.m2());
    }
}