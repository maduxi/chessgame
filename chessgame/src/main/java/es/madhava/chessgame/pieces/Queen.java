package es.madhava.chessgame.pieces;

import static es.madhava.chessgame.pieces.ChessPieceAbstract.getRow;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class Queen extends ChessPieceAbstract {

    private final Character type = 'q';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();
        pos.addAll(getRow(columns, rows, position));
        pos.addAll(getColumn(columns, rows, position));
        pos.addAll(getTopRightDiagonalPositions(columns, position));
        pos.addAll(getTopLeftDiagonalPositions(columns, position));
        pos.addAll(getBottomRightDiagonalPositions(columns, position, columns * rows));
        pos.addAll(getBottomLeftDiagonalPositions(columns, position, columns * rows));
        return pos;
    }

}
