package es.madhava.chessgame;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class Point {
    
    private int column;
    private int row;

    public Point(int column, int row) {
        this.column = column;
        this.row = row;
    }
    public Point(int position, int columns, int rows) {
        this.column = position % columns;
        this.row = (position / columns);  
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.column;
        hash = 67 * hash + this.row;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Point{" + "column=" + column + ", row=" + row + '}';
    }

    public static int getPositionFromPoint(Point p, int columns, int rows) {
        int rowValue = columns*p.getRow();
        return rowValue+p.getColumn();
    }
    
}
