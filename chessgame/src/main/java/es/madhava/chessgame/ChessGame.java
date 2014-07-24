package es.madhava.chessgame;

import es.madhava.chessgame.exceptions.TooManyPiecesException;
import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java App to calculate chess possibilities on a board
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class ChessGame {

    public static void main(String[] args) {
        GameConfig conf;
        try {

            conf = new GameConfig(args);
            System.out.println(conf);

            List<ArrayList<ChessPiece>> options = CalculateOptions.getOptions(conf);
            System.out.println("Options: " + options.size());
            for (ArrayList<ChessPiece> board : options) {
                CalculateOptions.printBoard(CalculateOptions.getBoardFromList(board, conf.getColumns(), conf.getRows()));
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, "This program needs 7 integer arguments.", ex);
        } catch (NumberFormatException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, "This program needs 7 integer arguments.", ex);
        } catch (TooManyPiecesException ex) {
            Logger.getLogger(ChessGame.class.getName()).log(Level.SEVERE, ex.getMessage());
        }
    }
}
