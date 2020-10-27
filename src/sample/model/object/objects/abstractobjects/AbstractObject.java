package sample.model.object.objects.abstractobjects;

import javafx.scene.image.ImageView;
import sample.model.enums.GameObjectType;
import sample.model.object.objects.implementation.Coordinate;
import sample.model.object.objects.interfaces.StaticObject;

import java.util.Objects;

public abstract class AbstractObject implements StaticObject {

    private GameObjectType type;
    private Coordinate coordinate;
    private ImageView icon = getImageView("/resource/icons/lorc/interdiction.png");


    //Getters and Setters
    @Override
    public ImageView getIcon() {
        return icon;
    }
    protected ImageView getImageView(String path) {
        return new ImageView(String.valueOf(getClass().getResource(path)));
    }

    public void setIcon(ImageView currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public GameObjectType getType() {
        return type;
    }

    public void setType(GameObjectType type) {
        this.type = type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractObject that = (AbstractObject) o;
        return type == that.type &&
                Objects.equals(coordinate, that.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, coordinate);
    }

    @Override
    public String toString() {
        return "type = " + type +
                " , coordinate = " + coordinate;
    }
}
