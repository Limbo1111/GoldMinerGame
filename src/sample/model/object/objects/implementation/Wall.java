package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class Wall extends AbstractObject {
    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        super.setIcon(getImageView("/resource/icons/img/wall.png"));
    }
}
