package sample.model.object.objects.implementation;

import sample.model.enums.GameObjectType;
import sample.model.enums.MovingDirection;
import sample.model.object.objects.abstractobjects.AbstractMovingObject;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class GoldMan  extends AbstractMovingObject {

    private int totalScore = 0;
    private int turnsNumber = 0;

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);
        super.setIconDown(getImageView("/resource/icons/img/goldman_down.png"));
        super.setIconUp(getImageView("/resource/icons/img/goldman_up.png"));
        super.setIconLeft(getImageView("/resource/icons/img/goldman_left.png"));
        super.setIconRight(getImageView("/resource/icons/img/goldman_right.png"));

        super.setIcon(super.getIconUp());
    }

    public void addTotalScore(int totalScore) {
        this.totalScore += totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
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
