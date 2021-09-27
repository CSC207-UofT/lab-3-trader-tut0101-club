public class Bike implements Drivable, Tradable{
    private int maxSpeed;

    public Bike() {
        this.maxSpeed = 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 3;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 3;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
