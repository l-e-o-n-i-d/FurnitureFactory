package home_work_factory;

import home_work_factory.furniture.armchair.Armchair;
import home_work_factory.furniture.armchair.ModernArmchair;
import home_work_factory.furniture.shelf.ModernShelf;
import home_work_factory.furniture.shelf.Shelf;
import home_work_factory.furniture.sofa.ModernSofa;
import home_work_factory.furniture.sofa.Sofa;
import home_work_factory.furniture.table.ModernTable;
import home_work_factory.furniture.table.Table;

public class ModernFabric implements Fabric{
    @Override
    public Armchair createArmchair() {
        return new ModernArmchair("Стар шіп", 1340);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Гіпер портал",5340.17);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Пульт керування",4340);
    }

    @Override
    public Shelf createShelf() {
        return new ModernShelf("Нана", 777.19);
    }
}
