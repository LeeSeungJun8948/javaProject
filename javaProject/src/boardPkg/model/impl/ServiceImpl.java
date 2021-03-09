package boardPkg.model.impl;

import boardPkg.control.BoardDAO;
import boardPkg.model.Board;
import boardPkg.model.Service;

public class ServiceImpl implements Service {
	
	
	BoardDAO dao = new BoardDAO();
	
	@Override
	public Board[] getBoardList() {
		// TODO Auto-generated method stub
		return dao.selectBoards();
	}

	@Override
	public Board getBoard(int boardNo) {
		// TODO Auto-generated method stub
		return dao.selectBoard(boardNo);
	}

	@Override
	public void createBoard(Board board) {
		// TODO Auto-generated method stub
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(Board board) {
		// TODO Auto-generated method stub
		dao.deleteBoard(board);
	}

}
