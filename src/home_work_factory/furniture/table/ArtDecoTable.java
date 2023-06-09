package home_work_factory.furniture.table;

public class ArtDecoTable implements Table{
    private final String name;
    private final double price;

    public ArtDecoTable(String name, double price){
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
