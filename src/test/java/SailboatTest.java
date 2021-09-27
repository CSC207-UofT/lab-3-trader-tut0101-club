import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SailboatTest {

    Sailboat s;

    @BeforeEach
    void setUp() {
        this.s = new Sailboat();
    }

    @Test(timeout = 50)
    void upgradeSpeed() {
        this.s.upgradeSpeed();
        assertEquals(16, this.s.getMaxSpeed());
    }

    @Test(timeout = 50)
    void downgradeSpeed() {
        this.s.downgradeSpeed();
        assertEquals(14, this.s.getMaxSpeed());
    }

    @Test(timeout = 50)
    void getMaxSpeed() {
        assertEquals(15, this.s.getMaxSpeed());
    }
}