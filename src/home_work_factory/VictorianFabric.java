package home_work_factory;

import home_work_factory.furniture.armchair.Armchair;
import home_work_factory.furniture.armchair.VictorianArmchair;
import home_work_factory.furniture.shelf.Shelf;
import home_work_factory.furniture.shelf.VictorianShelf;
import home_work_factory.furniture.sofa.ArtDecorSofa;
import home_work_factory.furniture.sofa.Sofa;
import home_work_factory.furniture.sofa.VictorianSofa;
import home_work_factory.furniture.table.Table;
import home_work_factory.furniture.table.VictorianTable;

public class VictorianFabric implements Fabric{
    @Override
    public Armchair createArmchair() {
        return new VictorianArmchair("Тиха гавань", 2340);
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa("Мудрість віків", 7340.57);
    }

    @Override
    public Table createTable() {
        return new VictorianTable("Місце роздумів", 4340);
    }

    @Override
    public Shelf createShelf() {
        return new VictorianShelf("Крафт", 807.07);
    }
}
