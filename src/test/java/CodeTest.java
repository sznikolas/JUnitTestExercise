import static org.junit.jupiter.api.Assertions.*;
import org.example.Code;
import org.junit.jupiter.api.Test;

public class CodeTest {

    @Test
    public void testSayHello(){
        Code code = new Code();
        assertEquals("Hello World", code.sayHello());
    }
}
