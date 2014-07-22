package es.madhava.chessgame;

import es.madhava.chessgame.exceptions.TooManyPiecesException;
import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java App to calculate chess possibilities on a board
 *
 */
public class ChessGame {

    public static void main(String[] args) {
        GameConfig conf;
        try {

            conf = new GameConfig(args);
            System.out.println(conf);

            List<ChessPiece[]> options = CalculateOptions.getOptions(conf);
            for(ChessPiece[] board : options){
                printBoard(CalculateOptions.fromArray(board,conf.getColumns(),conf.getRows()));
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, "This program needs 7 integer arguments.");
        } catch (NumberFormatException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, "This program needs 7 integer arguments.");
        } catch (TooManyPiecesException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }

    private static void printBoard(ChessPiece[][] board) {
        for(int i=0;i<board.length;i++){
            System.out.println("|");
            for(int j =0;j<board[i].length;j++){
                System.out.println(board[i][j].getType()+"|");
            }
            System.out.println("");
        }
    }
}
