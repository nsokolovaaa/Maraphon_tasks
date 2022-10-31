package org.example.Day17;

import java.io.FileNotFoundException;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][] {
            {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, ChessPiece.EMPTY},
            {ChessPiece.EMPTY,ChessPiece.ROOK_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
            {ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY}
        });
        chessBoard.print();

    }
}
