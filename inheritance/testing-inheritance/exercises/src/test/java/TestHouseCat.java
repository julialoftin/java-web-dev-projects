import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHouseCat {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), 0.001);
    }

}
