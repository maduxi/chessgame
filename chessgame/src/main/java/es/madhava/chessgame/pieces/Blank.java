/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author madhava
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
