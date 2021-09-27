import org.junit.*;

import static org.junit.Assert.*;

public class BikeTest {
    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(8, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(2, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, b.getPrice());
    }
}
