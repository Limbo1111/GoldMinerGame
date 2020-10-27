package sample.model.object.map.abstractmaps;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;
import sample.model.object.objects.implementation.Coordinate;
import sample.model.object.map.interfaces.CreateMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

public abstract class AbstractGameMap implements CreateMap, Serializable {

    private static final long serialVersionUID = 1L;

    private int width;
    private int height;
    private int timeLimit;
    private String name;

    private boolean isExitExist;
    private boolean isGoldManExist;

    private HashMap<Coordinate, AbstractObject> gameObjects = new HashMap<>(); // Access to Object by Coordinate
    private EnumMap<GameObjectType, ArrayList<AbstractObject>> typeObjects = new EnumMap<>(GameObjectType.class); // Access to ObjCollection by Type

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isExitExist() {
        return isExitExist;
    }

    public void setExitExist(boolean exitExist) {
        isExitExist = exitExist;
    }

    public boolean isGoldManExist() {
        return isGoldManExist;
    }

    public void setGoldManExist(boolean goldManExist) {
        isGoldManExist = goldManExist;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
    public AbstractObject getPriorityObject(AbstractObject firstObject, AbstractObject secondObject) {
        return (firstObject.getType().getIndexPriority() > secondObject.getType().getIndexPriority() ? firstObject : secondObject);
    }
    public boolean isValidMap() {
        return isExitExist && isGoldManExist;
    }
    public ArrayList<AbstractObject> getList(GameObjectType type) {
        return typeObjects.get(type);
    }

    public AbstractObject getObjectByCoordinate(Coordinate coordinate) {
        return gameObjects.get(coordinate);
    }
    public AbstractObject getObjectByCoordinate(int x, int y) {
        return gameObjects.get(new Coordinate(x, y));
    }


    // Adding objects to collection

    public void addGameObjects(AbstractObject object) {
        ArrayList<AbstractObject> tmpList = typeObjects.get(object.getType());
        if (tmpList == null) {
            tmpList = new ArrayList<>();
        }
        tmpList.add(object);

        gameObjects.put(object.getCoordinate(), object);
        typeObjects.put(object.getType(), tmpList);
    }

}
