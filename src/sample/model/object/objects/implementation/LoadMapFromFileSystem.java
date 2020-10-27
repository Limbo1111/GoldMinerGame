package sample.model.object.objects.implementation;

import sample.model.object.map.abstractmaps.AbstractGameMap;

public class LoadMapFromFileSystem extends AbstractGameMap {

    @Override
    public boolean loadMap(Object Source) {
        return false;
    }

    @Override
    public boolean saveMap(Object source) {
        return false;
    }

    @Override
    public boolean drawMap() {
        return false;
    }

}
