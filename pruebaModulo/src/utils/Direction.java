package utils;
public enum Direction {
    VERTICAL(1),HORIZONTAL(1),VERTICAL_INVERT(-1),HORIZONTAL_INVERT(-1);
    private int point;

    private Direction(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }



    
}