package home_work_factory;

import home_work_factory.furniture.armchair.Armchair;
import home_work_factory.furniture.armchair.ArtDecorArmchair;
import home_work_factory.furniture.shelf.ArtDecorShelf;
import home_work_factory.furniture.shelf.Shelf;
import home_work_factory.furniture.sofa.ArtDecorSofa;
import home_work_factory.furniture.sofa.Sofa;
import home_work_factory.furniture.table.ArtDecoTable;
import home_work_factory.furniture.table.Table;

public class ArtDecoFabric implements Fabric{
    @Override
    public Armchair createArmchair() {
        return new ArtDecorArmchair("Флоренція", 3203.9);
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecorSofa("Віола", 1973.52);
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable("Резон", 9877.5);
    }

    @Override
    public Shelf createShelf() {
        return new ArtDecorShelf("Вільнюс", 599.10);
    }
}
