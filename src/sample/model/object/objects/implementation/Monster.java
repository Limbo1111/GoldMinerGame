package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.enums.MovingDirection;
import sample.model.object.objects.abstractobjects.AbstractMovingObject;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);
        super.setIconDown(getImageView("/resource/icons/img/monster_down.jpg"));
        super.setIconUp(getImageView("/resource/icons/img/monster_up.jpg"));
        super.setIconLeft(getImageView("/resource/icons/img/monster_left.jpg"));
        super.setIconRight(getImageView("/resource/icons/img/monster_right.jpg"));

        super.setIcon(getIconLeft());
    }

    @Override
    public void move(MovingDirection direction) {
        super.move(direction);
    }

    @Override
    public void getMoveResult(AbstractObject objectInNewCoordinate) {
        super.getMoveResult(objectInNewCoordinate);
    }
}
