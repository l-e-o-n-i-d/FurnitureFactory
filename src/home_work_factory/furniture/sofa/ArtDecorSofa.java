package home_work_factory.furniture.sofa;

public class ArtDecorSofa implements Sofa{
    private final String name;
    private final double price;

    public ArtDecorSofa(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
