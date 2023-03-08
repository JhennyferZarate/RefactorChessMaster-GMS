package model.board;

import model.game.ChessGamePiece;

public interface SquareObserver {
    void updateSquare(ChessGamePiece piece);
}
