import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C11Test {

    private C11 c11 = new C11();

    @Test
    void testM1(){
        assertEquals("m1 ",this.c11.m1());
    }

    @Test
    void testM2(){
        assertEquals("m2",this.c11.m2());
    }
}