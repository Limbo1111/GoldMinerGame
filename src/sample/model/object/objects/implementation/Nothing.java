package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class Nothing extends AbstractObject {

    public Nothing(Coordinate coordinate) {
        super.setType(GameObjectType.NOTHING);
        super.setCoordinate(coordinate);
        super.setIcon(null);
    }
}
