/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame;

import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author madhava
 */
public class CalculateOptions {

    static List<ChessPiece[]> getOptions(GameConfig conf) {
        List<ChessPiece[]> result = new ArrayList<ChessPiece[]>();
        ChessPiece[] c = conf.getPieces().toArray(new ChessPiece[conf.getPieces().size()]);
        do {
            if (validate(c,conf)) {
                result.add(c);
            }
        } while ((c = PermutationsExpert.nextPermutation(c)) != null);
        return result;
    }

    private static boolean validate(ChessPiece[] c, GameConfig conf) {
        int line=0;
        int column=0;
        boolean result=true;
        for(int i=0;i<c.length;i++){
            c[i].checkPosition(c,conf,line,column);
        }
        return result;
    }
    
    public static ChessPiece[][] fromArray(ChessPiece[] pieces, int columns, int rows){
        ChessPiece[][] result = new ChessPiece[columns][rows];
        int column=0;
        int row=0;
        for(int i =0;i<pieces.length;i++){
            result[column][row] = pieces[i];
            row= (int) (i/columns);
            column = i%columns;
        }
        return result;
    }
}
