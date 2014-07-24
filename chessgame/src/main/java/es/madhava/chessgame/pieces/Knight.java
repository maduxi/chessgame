package es.madhava.chessgame.pieces;

import es.madhava.chessgame.Point;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class Knight extends ChessPieceAbstract {

    private final Character type = 'n';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();

        Point p = getPointFromPosition(position, columns, rows);

        Set<Point> points = new HashSet<Point>();

        points.add(new Point(p.getColumn() - 2, p.getRow() - 1));

        points.add(new Point(p.getColumn() - 2, p.getRow() + 1));

        points.add(new Point(p.getColumn() - 1, p.getRow() - 2));

        points.add(new Point(p.getColumn() - 1, p.getRow() + 2));
        
        points.add(new Point(p.getColumn() + 1, p.getRow() - 2));
        
        points.add(new Point(p.getColumn() + 1, p.getRow() + 2));

        points.add(new Point(p.getColumn() + 2, p.getRow() - 1));
        
        points.add(new Point(p.getColumn() + 2, p.getRow() + 1));
        
        for(Point pt : points){
            if(pt.getColumn()<columns && pt.getRow()<rows && pt.getColumn()>=0 && pt.getRow()>=0){
                pos.add(getPositionFromPoint(pt, columns, rows));
            }
        }

        return pos;
    }
}
