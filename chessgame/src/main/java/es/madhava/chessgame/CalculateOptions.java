package es.madhava.chessgame;

import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class CalculateOptions {

    static List<ArrayList<ChessPiece>> getOptions(GameConfig conf) {
        List<ArrayList<ChessPiece>> result = new ArrayList<ArrayList<ChessPiece>>();
        Set<Integer> toDefend = new HashSet<Integer>();
        Set<Integer> underAttack = new HashSet<Integer>();
        result.addAll(tryOptions(new ArrayList<ChessPiece>(), conf.getPieces(), toDefend, underAttack, conf.getColumns(), conf.getRows()));
        return result;
    }

    protected static Set<ArrayList<ChessPiece>> tryOptions(ArrayList<ChessPiece> fill, ArrayList<ChessPiece> full, Set<Integer> toDefend, Set<Integer> underAttack, int columns, int rows) {
        Set<ArrayList<ChessPiece>> result = new HashSet<ArrayList<ChessPiece>>();
        if (full.isEmpty()) {
            result.add(fill);
        } else {
            ArrayList<ChessPiece> tmpFull;
            ArrayList<ChessPiece> tmpFill;
            Set<Integer> uAttack;
            ChessPiece piece;
            ChessPiece oldPiece = null;
            for (int i = 0; i < full.size(); i++) {
                tmpFull = (ArrayList) full.clone();
                piece = tmpFull.remove(i);
                if (oldPiece == null || !piece.equals(oldPiece)) {
                    tmpFill = (ArrayList) fill.clone();
                    if (!underAttack.contains(tmpFill.size()) || piece.isEmpty()) {
                        uAttack = piece.getAttackSquares(columns, rows, tmpFill.size());
                        if (Collections.disjoint(uAttack, toDefend)) {
                            Set<Integer> tDef = new HashSet<Integer>();
                            tDef.addAll(toDefend);
                            if (!piece.isEmpty()) {
                                tDef.add(tmpFill.size());
                            }
                            uAttack.addAll(underAttack);
                            tmpFill.add(piece);
                            result.addAll(tryOptions(tmpFill, tmpFull, tDef, uAttack, columns, rows));
                        }
                    }
                    oldPiece = piece;
                }
            }
        }
        return result;
    }
}
