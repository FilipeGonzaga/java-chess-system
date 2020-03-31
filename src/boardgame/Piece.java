package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Protected pois s� quem ir� acessar S�o as classes e sub classes do board
	//Isso evita possiveis erros de programadores 
	protected Board getBoard() {
		return board;
	}

}
