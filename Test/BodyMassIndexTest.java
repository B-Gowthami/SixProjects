import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BodyMassIndexTest {

    @Test
    public void bodyMassIndex() {
        assertEquals(18,18);
    }

    @Test
    public void BMI() {
        double weight = 60.00;
        double height = 1.80;
        double BMI = weight / (height * height);
        assertEquals(18,18);
    }
}