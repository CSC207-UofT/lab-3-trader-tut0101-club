/* Class that implements the Domesticatable and Tradable interfaces*/
public class Cat implements Domesticatable, Tradable{

    public Cat() {}

    @Override
    public String sound() {return "Meow!";}

    @Override
    public int getPrice() {return 3;}

}
