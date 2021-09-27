import org.junit.*;

import static org.junit.Assert.*;


public class HondCivic2007Test {
    HondCivic2007 h;

    @Before
    public void setUp() throws Exception {
        h = new HondCivic2007();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(4, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(5, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(3, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, h.getPrice());
    }

}