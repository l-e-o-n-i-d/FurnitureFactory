package home_work_factory;

import home_work_factory.furniture.shelf.Shelf;
import home_work_factory.furniture.armchair.Armchair;
import home_work_factory.furniture.sofa.Sofa;
import home_work_factory.furniture.table.Table;

public interface Fabric {
    Armchair createArmchair();
    Sofa createSofa();
    Table createTable();
    Shelf createShelf();
}
