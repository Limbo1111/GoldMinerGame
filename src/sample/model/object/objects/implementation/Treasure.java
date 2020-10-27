package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class Treasure extends AbstractObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageView("/resource/icons/img/gold.png"));
    }

    private int score = 5;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
