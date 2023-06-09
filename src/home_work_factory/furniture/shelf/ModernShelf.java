package home_work_factory.furniture.shelf;

public class ModernShelf implements Shelf {
    private final String name;
    private final double price;

    public ModernShelf(String name, double price) {
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
