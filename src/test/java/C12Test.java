import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C12Test {

    private C12 c12 = new C12();

    @Test
    void testMA(){
        assertEquals("mA",this.c12.mA());
    }

}