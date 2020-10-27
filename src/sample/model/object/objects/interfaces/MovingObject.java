package sample.model.object.objects.interfaces;

import javafx.scene.image.ImageView;
import sample.model.enums.MovingDirection;
import sample.model.object.objects.abstractobjects.AbstractObject;

public interface MovingObject extends StaticObject{

    void move(MovingDirection direction);
    void getMoveResult(AbstractObject objectInNewCoordinate);


    ImageView getIconLeft();
    ImageView getIconRight();
    ImageView getIconUp();
    ImageView getIconDown();

}
