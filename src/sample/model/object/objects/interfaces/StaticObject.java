package sample.model.object.objects.interfaces;

import javafx.scene.image.ImageView;
import sample.model.enums.GameObjectType;
import sample.model.object.objects.implementation.Coordinate;

public interface StaticObject {

    ImageView getIcon();
    GameObjectType getType();
    Coordinate getCoordinate();
}
