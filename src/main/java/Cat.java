/* Class that implements the Domesticatable and Tradable interfaces*/
public class Cat implements Domesticatable, Tradable{

    public Cat() {}

    /* Returns the sound that the cat makes.*/
    @Override
    public String sound() {return "Meow!";}

    /* Returns the price of the cat.*/
    @Override
    public int getPrice() {return 3;}

    /* Returns a String representation of the cat.*/
    @Override
    public String toString() {
        return super.toString();
    }

}
