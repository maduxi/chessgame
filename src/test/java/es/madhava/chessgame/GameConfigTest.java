package es.madhava.chessgame;

import es.madhava.chessgame.exceptions.TooManyPiecesException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class GameConfigTest {

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testInvalidArgsSize() throws ArrayIndexOutOfBoundsException, NumberFormatException, TooManyPiecesException {
        System.out.println("ArrayIndexOutOfBoundsException");
        String[] args = {"10","20","3","4","5","6"};
        GameConfig instance = new GameConfig(args);
    }

    @Test(expected=NumberFormatException.class)
    public void testInvalidArgsValues() throws ArrayIndexOutOfBoundsException, NumberFormatException, TooManyPiecesException {
        System.out.println("NumberFormatException");
        String[] args = {"10","20","3","4","5","6","M"};
        GameConfig instance = new GameConfig(args);
    }   
    
    @Test(expected=TooManyPiecesException.class)
    public void testInvalidBoardSize() throws ArrayIndexOutOfBoundsException, NumberFormatException, TooManyPiecesException {
        System.out.println("NumberFormatException");
        String[] args = {"1","2","3","4","5","6","3"};
        GameConfig instance = new GameConfig(args);
    }  
    
    @Test
    public void testPiecesSize() throws ArrayIndexOutOfBoundsException, NumberFormatException, TooManyPiecesException {
        System.out.println("NumberFormatException");
        String[] args = {"10","20","3","4","5","6","5"};
        GameConfig instance = new GameConfig(args);
        assertEquals(instance.getPieces().size(),200);
    }  

}
