
public abstract class Plants implements Nutrition{

    //inkaplsade variabler
    private final double height;
    private final String name;

    //konstruktor
    public Plants(double height, String name) {
        this.height = height;
        this.name = name;
    }
    //metoder för att komma åt de inkaplsade variablerna
    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}





