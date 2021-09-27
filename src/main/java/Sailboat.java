public class Sailboat implements Tradable, Drivable {

    private int maxSpeed;

    public Sailboat() {
        this.maxSpeed = 15;  // knots
    }

    /**
     * Return a String representation of this Sailboat.
     *
     * @return this Sailboat's representation
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

    /**
     * Upgrade this Sailboat's speed by a fixed amount.
     */
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 1;
    }

    /**
     * Downgrade Sailboat's speed by a fixed amount.
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 1;
    }

    /**
     * Return this Sailboat's maximum speed in knots.
     *
     * @return speed in knots
     */
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Return this Sailabot's price.
     *
     * @return price in dollars
     */
    @Override
    public int getPrice() {
        return 50;
    }

}
