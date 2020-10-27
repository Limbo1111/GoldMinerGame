package sample.model.object.fabrics;

import sample.model.enums.LocationType;
import sample.model.object.map.abstractmaps.AbstractGameMap;
import sample.model.object.map.implementation.DBGameMap;
import sample.model.object.map.implementation.FSGameMap;

public class MapFabric {
    private static MapFabric instance;
    public static MapFabric getInstance() {
        if (instance == null) {
            instance = new MapFabric();
        }
        return instance;
    }

    public AbstractGameMap createMap(LocationType type) {
        AbstractGameMap gameMap = null;

        switch (type) {
            case DB -> {
                gameMap = new FSGameMap();
            }
            case FS -> {
                gameMap = new DBGameMap();
            }
            default ->
                    throw new IllegalArgumentException("Game can`t create a new map< by type " + type);
        } return gameMap;
    }
}
