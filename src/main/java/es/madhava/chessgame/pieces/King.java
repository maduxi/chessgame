package es.madhava.chessgame.pieces;

import es.madhava.chessgame.Point;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class King extends ChessPieceAbstract {

    private final Character type = 'k';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        HashSet<Integer> result = new HashSet<Integer>();
        
        Point p = new Point(position, columns, rows);

        
        if (p.getColumn() >0 ) {
            result.add(position - 1);
            if (p.getRow() > 0) {
                result.add(position - columns - 1);
                result.add(position - columns);
            }
            if (p.getRow() < rows-1) {
                result.add(position + columns - 1);
                result.add(position + columns);
            }
        }
        if (p.getColumn() < columns-1) {
            result.add(position + 1);
            if (p.getRow() > 0) {
                result.add(position - columns + 1);
                result.add(position - columns);
            }
            if (p.getRow() < rows-1) {
                result.add(position + columns + 1);
                result.add(position + columns);
            }
        }

        return result;
    }
}
