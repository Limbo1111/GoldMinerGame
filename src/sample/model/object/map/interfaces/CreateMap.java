package sample.model.object.map.interfaces;

public interface CreateMap {

    int getHeight();
    int getWidth();
    boolean saveMap(Object source);
    boolean loadMap(Object source);
    boolean drawMap();

    int getTimeLimit();
}
