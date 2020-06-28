package Model;

import java.util.Random;

import utils.Direction;

public class CoordinatesWraper {

    private Coordinates coordinatesRef;

    public CoordinatesWraper() {
        this.coordinatesRef = this.random();
    };

    public CoordinatesWraper(int file, int column) {
        coordinatesRef = new Coordinates(file, column);
    }

    public Coordinates createCordinates(Direction direction, int dimension) {
        Coordinates coordinatesRef = this.coordinatesRef;
        switch (direction) {
            case VERTICAL:
                this.coordinatesRef.setFile(coordinatesRef.getFile() + dimension);
                break;
            case HORIZONTAL:
                this.coordinatesRef.setColumn(coordinatesRef.getColumn() + dimension);

                break;
            case VERTICAL_INVERT:
                this.coordinatesRef.setFile(coordinatesRef.getFile() - dimension);
                break;
            case HORIZONTAL_INVERT:
                this.coordinatesRef.setColumn(coordinatesRef.getColumn() - dimension);
                break;
        }
        return coordinatesRef;
    }

    public Coordinates random() {
        int[] random = new Random().ints(2, 0, 13).toArray();
        return new Coordinates(random[0], random[1]);

    }

    public Coordinates getCoordinatesRef() {
        return coordinatesRef;
    }

    public void setCoordinatesRef(Coordinates coordinatesRef) {
        this.coordinatesRef = coordinatesRef;
    }

}