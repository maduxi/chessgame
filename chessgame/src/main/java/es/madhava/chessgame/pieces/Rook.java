/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import es.madhava.chessgame.GameConfig;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author madhava
 */
public class Rook extends ChessPieceAbstract {

    private final Character type = 'r';

    public Character getType() {
        return type;
    }

    public Set<Integer> getUnderAttack(int columns, int rows, int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
