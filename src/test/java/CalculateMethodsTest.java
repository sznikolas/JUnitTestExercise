import org.example.CalculateMethods;
import static org.junit.jupiter.api.Assertions.*; //static import, hogy ne kelljen mindig kiirni h Assertion.assertEquals...
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculateMethodsTest {
    private CalculateMethods calculateMethods;

    @BeforeEach //mindig ez legyen az elso
    public void initTest(){
        calculateMethods = new CalculateMethods();
    }

    @Test
    public void testDivide(){
        assertEquals(10,calculateMethods.divide(100,10));
    }

    @Test
    public void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100,0));
    }

}
