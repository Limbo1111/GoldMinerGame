package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class Exit  extends AbstractObject {
    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageView("/icons/img/exit.gif"));
    }

}
