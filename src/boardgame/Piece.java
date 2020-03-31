package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Protected pois só quem irá acessar São as classes e sub classes do board
	//Isso evita possiveis erros de programadores 
	protected Board getBoard() {
		return board;
	}

}
