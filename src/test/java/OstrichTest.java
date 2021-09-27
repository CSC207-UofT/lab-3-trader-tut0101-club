import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OstrichTest {
    Ostrich o;

    @Before
    public void setUp() throws Exception {
        o = new Ostrich();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Squeak!", o.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, o.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        o.upgradeSpeed();
        assertEquals(2, o.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        o.downgradeSpeed();
        assertEquals(0, o.getMaxSpeed());
    }

}
