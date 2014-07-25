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
public class OptionsCalculator {
    
    private static long log= 0;
    private static final long logMargin=5000;
    private final GameConfig conf;

    public OptionsCalculator(GameConfig conf) {
        this.conf = conf;
    }

    public List<ArrayList<ChessPiece>> getOptions() {
        List<ArrayList<ChessPiece>> result = new ArrayList<ArrayList<ChessPiece>>();
        Set<Integer> toDefend = new HashSet<Integer>();
        Set<Integer> underAttack = new HashSet<Integer>();
        result.addAll(getOptionsRecursively(new ArrayList<ChessPiece>(), conf.getPieces(), toDefend, underAttack));
        return result;
    }

    protected Set<ArrayList<ChessPiece>> getOptionsRecursively(ArrayList<ChessPiece> fill, ArrayList<ChessPiece> full, Set<Integer> toDefend, Set<Integer> underAttack) {
        Set<ArrayList<ChessPiece>> result = new HashSet<ArrayList<ChessPiece>>();
        printPointEveryMarginTime();
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
                //We don't want to follow the same tree twice
                if (oldPiece == null || !piece.equals(oldPiece)) {
                    tmpFill = (ArrayList) fill.clone();
                    //Make sure we can add this piece here
                    if (!underAttack.contains(tmpFill.size()) || piece.isEmpty()) {
                        uAttack = piece.getAttackSquares(conf.getColumns(), conf.getRows(), tmpFill.size());
                        //Make sure this piece won't threat any other so far
                        if (Collections.disjoint(uAttack, toDefend)) {
                            Set<Integer> tDef = new HashSet<Integer>();
                            tDef.addAll(toDefend);
                            if (!piece.isEmpty()) {
                                tDef.add(tmpFill.size());
                            }
                            uAttack.addAll(underAttack);
                            tmpFill.add(piece);
                            result.addAll(getOptionsRecursively(tmpFill, tmpFull, tDef, uAttack));
                        }
                    }
                    oldPiece = piece;
                }
            }
        }
        return result;
    }

    protected static void printPointEveryMarginTime() {
        
        if(System.currentTimeMillis()-log>logMargin){
            log=System.currentTimeMillis();
            System.out.print(".");
        }
    }
}
