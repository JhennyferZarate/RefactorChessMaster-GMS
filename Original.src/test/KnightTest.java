package test;

import junit.framework.TestCase;
import model.board.ChessGameBoard;
import model.game.ChessGamePiece;
import model.pieces.Knight;

import java.util.ArrayList;

public class KnightTest extends TestCase {
    public void testCalculateNorthMoves(){
        ChessGameBoard board = new ChessGameBoard();
        Knight knight = new Knight(board, 0, 1, ChessGamePiece.WHITE);
        ArrayList<String> expectedMoves = new ArrayList<>();
        expectedMoves.add("2,2");
        expectedMoves.add("2,0");
        assertEquals(expectedMoves, knight.calculateNorthMoves(board));
    }
    public void testCalculateSouthMoves(){
        ChessGameBoard board = new ChessGameBoard();
        Knight knight = new Knight(board, 7, 1, ChessGamePiece.BLACK);
        ArrayList<String> expectedMoves = new ArrayList<>();
        expectedMoves.add("6,3");
        assertEquals(expectedMoves, knight.calculateSouthMoves(board));
    }

    public void testCalculatePossibleMoves(){
        ChessGameBoard board = new ChessGameBoard();
        Knight knight = new Knight(board, 3, 3, ChessGamePiece.WHITE);
        ArrayList<String> expectedMoves = new ArrayList<>();
        expectedMoves.add("5,4");
        expectedMoves.add("5,2");
        expectedMoves.add("1,4");
        expectedMoves.add("1,2");
        expectedMoves.add("4,5");
        expectedMoves.add("4,1");
        expectedMoves.add("2,5");
        expectedMoves.add("2,1");
        assertEquals(expectedMoves, knight.calculatePossibleMoves(board));
    }
}
