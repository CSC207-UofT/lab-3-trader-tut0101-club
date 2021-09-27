import org.junit.*;
import static org.junit.Assert.*;

public class SailboatTest {

    Sailboat s;

    @Before
    public void setUp() {
        this.s = new Sailboat();
    }

    @Test(timeout = 50)
    public void upgradeSpeed() {
        this.s.upgradeSpeed();
        assertEquals(16, this.s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void downgradeSpeed() {
        this.s.downgradeSpeed();
        assertEquals(14, this.s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void getMaxSpeed() {
        assertEquals(15, this.s.getMaxSpeed());
    }
}