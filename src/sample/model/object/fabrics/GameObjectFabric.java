package sample.model.object.fabrics;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;
import sample.model.object.objects.implementation.*;

public class GameObjectFabric {

    private static GameObjectFabric instance;

    public static GameObjectFabric getInstance() {
        if (instance == null) {
            instance = new GameObjectFabric();
        } return instance;
    }
    public AbstractObject createObject(GameObjectType type, Coordinate coordinate) {
        AbstractObject obj = null;

        switch (type) {
            case EXIT -> {
                obj = new Exit(coordinate);
                break;
            }
            case WALL -> {
                obj = new Wall(coordinate);
                break;
            }
            case MONSTER -> {
                obj = new Monster(coordinate);
                break;
            }
            case NOTHING -> {
                obj = new Nothing(coordinate);
                break;
            }
            case TREASURE -> {
                obj = new Treasure(coordinate);
                break;
            }
            case GOLDMAN -> {
                obj = new GoldMan(coordinate);
                break;
            }
            default -> throw  new IllegalArgumentException("Can`t create object type: " + type);
        } return obj;
    }
}
