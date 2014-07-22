/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

/**
 *
 * @author madhava
 */
public abstract class ChessPieceAbstract implements ChessPiece {

    public int compareTo(Object o) {
        if (o instanceof ChessPiece) {
            return this.getType().compareTo(((ChessPiece) o).getType());
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.getType().toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof ChessPieceAbstract && ((ChessPieceAbstract) object).getType().equals(this.getType())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int seed = 43;
        return seed * this.getType().hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

}
