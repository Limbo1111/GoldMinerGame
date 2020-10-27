package sample.model.object.objects.implementation;

import java.io.Serializable;

public class Coordinate implements Serializable {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Getters and Setters
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    //Equals, HashCode and toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate objCoordinate = (Coordinate) o;
        return (x == objCoordinate.getX() &&
                y == objCoordinate.getY());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.x;
        hash = 19 * hash + this.y;
        return hash;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y =" + y;
    }
}
