package com.brasee.chess;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.brasee.chess.Game.MoveType;
import com.brasee.chess.pieces.King;
import com.brasee.chess.pieces.Knight;
import com.brasee.chess.pieces.Pawn;
import com.brasee.chess.pieces.Piece;
import com.brasee.chess.pieces.Rook;
import com.brasee.chess.pieces.Piece.Color;

public class GameCastlingTest {

	private Game game;
	
	@Before
	public void setUp() {
		game = new Game();
	}
	
	@Test
	public void testCastlingSuccessfulWithWhitePiecesKingside() {
		Piece rook = new Rook(Color.WHITE);
		Piece king = new King(Color.WHITE);
		game.board().placePiece(new Square("e1"), king);
		game.board().placePiece(new Square("h1"), rook);
		assertEquals(MoveType.CASTLING, game.move(new Square("e1"), new Square("g1")));
		assertTrue(king.equals(game.board().pieceOn(new Square("g1"))));
		assertTrue(rook.equals(game.board().pieceOn(new Square("f1"))));
		assertFalse(king.isFirstMove());
		assertFalse(rook.isFirstMove());
	}
	
	@Test
	public void testCastlingSuccessfulWithBlackPiecesKingside() {
		// move white piece to change turn to black
		Piece pawn = new Pawn(Color.WHITE);
		game.board().placePiece(new Square("a2"), pawn);
		game.move(new Square("a2"), new Square("a3"));
		
		Piece rook = new Rook(Color.BLACK);
		Piece king = new King(Color.BLACK);
		game.board().placePiece(new Square("e8"), king);
		game.board().placePiece(new Square("h8"), rook);
		assertEquals(MoveType.CASTLING, game.move(new Square("e8"), new Square("g8")));
		assertTrue(king.equals(game.board().pieceOn(new Square("g8"))));
		assertTrue(rook.equals(game.board().pieceOn(new Square("f8"))));
		assertFalse(king.isFirstMove());
		assertFalse(rook.isFirstMove());		
	}
	
	@Test
	public void testCastlingSuccessfulWithWhitePiecesQueenside() {
		Piece rook = new Rook(Color.WHITE);
		Piece king = new King(Color.WHITE);
		game.board().placePiece(new Square("e1"), king);
		game.board().placePiece(new Square("a1"), rook);
		assertEquals(MoveType.CASTLING, game.move(new Square("e1"), new Square("c1")));
		assertTrue(king.equals(game.board().pieceOn(new Square("c1"))));
		assertTrue(rook.equals(game.board().pieceOn(new Square("d1"))));
		assertFalse(king.isFirstMove());
		assertFalse(rook.isFirstMove());		
	}
	
	@Test
	public void testCastlingSuccessfulWithBlackPiecesQueenside() {
		// move white piece to change turn to black
		Piece pawn = new Pawn(Color.WHITE);
		game.board().placePiece(new Square("a2"), pawn);
		game.move(new Square("a2"), new Square("a3"));
		
		Piece rook = new Rook(Color.BLACK);
		Piece king = new King(Color.BLACK);
		game.board().placePiece(new Square("e8"), king);
		game.board().placePiece(new Square("a8"), rook);
		assertEquals(MoveType.CASTLING, game.move(new Square("e8"), new Square("c8")));
		assertTrue(king.equals(game.board().pieceOn(new Square("c8"))));
		assertTrue(rook.equals(game.board().pieceOn(new Square("d8"))));
		assertFalse(king.isFirstMove());
		assertFalse(rook.isFirstMove());		
	}
	
	@Test
	public void testCastlingFailsWhenAPieceHasAlreadyMoved() {
		Piece rook = new Rook(Color.WHITE);
		Piece king = new King(Color.WHITE);
		rook.updateHasMoved();
		game.board().placePiece(new Square("e1"), king);
		game.board().placePiece(new Square("h1"), rook);
		assertEquals(MoveType.INVALID, game.move(new Square("e1"), new Square("g1")));
	}
	
	@Test
	public void testCastlingFailsWhenAPieceIsBetweenRookAndKing() {
		Piece rook = new Rook(Color.WHITE);
		Piece king = new King(Color.WHITE);
		Piece knight = new Knight(Color.WHITE);
		game.board().placePiece(new Square("e1"), king);
		game.board().placePiece(new Square("h1"), rook);
		game.board().placePiece(new Square("g1"), knight);
		assertEquals(MoveType.INVALID, game.move(new Square("e1"), new Square("h1")));
	}
	
}
