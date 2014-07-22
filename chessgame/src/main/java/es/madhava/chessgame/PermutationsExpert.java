/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame;

import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author madhava
 */
public class PermutationsExpert {

    protected static Set<ArrayList<ChessPiece>> getPermutations(ArrayList<ChessPiece> fill, ArrayList<ChessPiece> full) {
        Set<ArrayList<ChessPiece>> result = new HashSet<ArrayList<ChessPiece>>();
        if (full.isEmpty()) {
            result.add(fill);
        } else {
            ArrayList<ChessPiece> tmpFull;
            ArrayList<ChessPiece> tmpFill;
            for (int i = 0; i < full.size(); i++) {
                tmpFull = (ArrayList)full.clone();
                ChessPiece remove = tmpFull.remove(i);
                tmpFill = (ArrayList)fill.clone();
                tmpFill.add(remove);
                result.addAll(getPermutations(tmpFill, tmpFull));
            }
        }
        return result;
    }
    
    public static Set<ArrayList<ChessPiece>> getPermutations(ArrayList<ChessPiece> full){
        return getPermutations(new ArrayList<ChessPiece>(),full);
    }

//    public static void main(String[] args) {
//        ArrayList<ChessPiece> empty = new ArrayList<ChessPiece>();
//        ArrayList<ChessPiece> full = new ArrayList<ChessPiece>();
//        full.add(new Bishop());
//        full.add(new Blank());
//        full.add(new Knight());
//        full.add(new Knight());
//        Set<ArrayList<ChessPiece>> printPermutations = getPermutations(empty, full);
//        for(ArrayList<ChessPiece> l :printPermutations){
//            System.out.println(l);
//        }
//    }
}
