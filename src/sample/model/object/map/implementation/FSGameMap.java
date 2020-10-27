package sample.model.object.map.implementation;

import sample.model.enums.GameObjectType;
import sample.model.object.map.abstractmaps.AbstractGameMap;
import sample.model.object.objects.abstractobjects.AbstractObject;
import sample.model.object.fabrics.GameObjectFabric;
import sample.model.object.objects.implementation.Coordinate;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Class for create Map from File System
public class FSGameMap extends AbstractGameMap {
    @Override
    public boolean loadMap(Object source) {
        File file = new File(source.toString());
        if (!file.exists()) {
            throw new IllegalArgumentException("The path should be not empty. Please, enter the valid path.");
        }
        try {
            setExitExist(false);
            setGoldManExist(false);
            setHeight(getLineCount(file));

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String strLine = bufferedReader.readLine().trim();

            setName(strLine.split(",")[0]);
            setTimeLimit(Integer.valueOf(strLine.split(",")[1]).intValue());
            setWidth(Integer.valueOf(strLine.split(",")[2]).intValue());

            int y = 0;
            int x = 0;

            while ((strLine = bufferedReader.readLine()) != null) {
                x = 0;
                for (String str : strLine.split(",")) {
                    createGameObject(str, new Coordinate(x, y));
                    x++;
                }
                y++;
            }
            if (!isValidMap()) {
                throw new IOException("The map is not valid. Please set a right map");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return true;
    }

    @Override
    public boolean saveMap(Object source) {
        return false;
    }

    @Override
    public boolean drawMap() {
        return false;
    }

    private int getLineCount(File file) {
        BufferedReader reader = null;
        int lineCount = 0;

        try {
            reader = new BufferedReader(new FileReader(file));

            while (reader.readLine() != null) {
                lineCount++;
            }
            lineCount = lineCount - 1;
        } catch (IOException e) {
            Logger.getLogger(FSGameMap.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                Logger.getLogger(FSGameMap.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return lineCount;
    }
    public void createGameObject(String str, Coordinate coordinate) {
        GameObjectType type = GameObjectType.valueOf(str.toUpperCase());

        AbstractObject newObject = GameObjectFabric.getInstance().createObject(type, coordinate);
        addGameObjects(newObject);
        if (newObject.getType() == GameObjectType.EXIT) {
            setExitExist(true);
        } else if (newObject.getType() == GameObjectType.GOLDMAN) {
            setGoldManExist(true);
        }
    }
}
