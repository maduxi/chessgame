package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class Blank extends ChessPieceAbstract {

    private final Character type = ' ';

    public Character getType() {
        return type;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
       return new HashSet<Integer>();
    }


}
