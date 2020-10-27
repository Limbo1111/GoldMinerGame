package sample.model.enums;

public enum GameObjectType {
    MONSTER(5),
    TREASURE(4),
    EXIT(3),
    WALL(2),
    GOLDMAN(1),
    NOTHING(-1);

    GameObjectType(int indexPriority) {
        this.indexPriority = indexPriority;
    }

    private int indexPriority;

    public int getIndexPriority() {
        return indexPriority;
    }
}
