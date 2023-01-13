import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {
    @BeforeEach
    public void printMsg(){
        Main2 main2 = new Main2();
    }


    @Test
    void sumTwoNumbers() {
        Main2 main2 = new Main2();
        int a  = 5; int b =8;
        assertEquals(13, main2.sumTwoNumbers(a, b));
    }

    @Test
    void subtractTwoNumbers(){
        Main2 main2 = new Main2();
        assertNotEquals(0, main2.subtractTwoNumbers(5, 3));
    }

}