package sample.model.object.objects.abstractobjects;

import javafx.scene.image.ImageView;
import sample.model.enums.MovingDirection;
import sample.model.object.objects.interfaces.MovingObject;

public abstract class AbstractMovingObject extends AbstractObject implements MovingObject {

    private ImageView iconLeft;
    private ImageView iconRight;
    private ImageView iconUp;
    private ImageView iconDown;



    @Override
    public void move(MovingDirection direction) {
    }

    @Override
    public void getMoveResult(AbstractObject objectInNewCoordinate) {

    }

    @Override
    public ImageView getIconLeft() {
        return iconLeft;
    }

    public void setIconLeft(ImageView iconLeft) {
        this.iconLeft = iconLeft;
    }

    @Override
    public ImageView getIconRight() {
        return iconRight;
    }

    public void setIconRight(ImageView iconRight) {
        this.iconRight = iconRight;
    }

    @Override
    public ImageView getIconUp() {
        return iconUp;
    }

    public void setIconUp(ImageView iconUp) {
        this.iconUp = iconUp;
    }

    @Override
    public ImageView getIconDown() {
        return iconDown;
    }

    public void setIconDown(ImageView iconDown) {
        this.iconDown = iconDown;
    }
}
