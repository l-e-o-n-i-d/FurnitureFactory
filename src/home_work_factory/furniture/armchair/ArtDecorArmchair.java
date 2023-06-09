package home_work_factory.furniture.armchair;

public class ArtDecorArmchair implements Armchair {
    private final String name;
    private final double price;

    public ArtDecorArmchair(String name, double price){
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
