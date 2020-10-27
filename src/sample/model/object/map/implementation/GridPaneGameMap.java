package sample.model.object.map.implementation;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import sample.model.enums.LocationType;
import sample.model.object.fabrics.MapFabric;
import sample.model.object.map.abstractmaps.AbstractGameMap;
import sample.model.object.map.interfaces.DrawableMap;
import sample.model.object.objects.abstractobjects.AbstractObject;

public class GridPaneGameMap implements DrawableMap {

    private GridPane gridPane = new GridPane();
    private AbstractGameMap gameMap;
    private String[] columnNames;

    private AbstractObject[][] mapObject;

    public GridPaneGameMap(LocationType type, Object source) {
        /*

        Empty fields for impl method

         */
        gameMap = MapFabric.getInstance().createMap(type);
        gameMap.loadMap(source);
    }

    @Override
    public boolean drawMap() {
        return false;
    }

    @Override
    public Node getMap() {
        return null;
    }
}
