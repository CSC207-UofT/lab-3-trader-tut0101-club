public class Ostrich implements Tradable, Domesticatable, Drivable{
    private int maxSpeed;

    public Ostrich(){ this.maxSpeed = 1; }

    @Override
    public String sound() {
        return "Squeak!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
