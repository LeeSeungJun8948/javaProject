package boardPkg.control;

import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;

//실행되는 class
public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new ServiceImpl();

		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("-------------------------------------");
			System.out.print("메뉴 입력>>");
			menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("게시글 번호 입력>>");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("게시글 제목 입력>>");
				String title = scn.nextLine();
				System.out.print("게시글 내용 입력>>");
				String content = scn.nextLine();
				System.out.print("게시글 작성자 입력>>");
				String writer = scn.nextLine();
				System.out.print("게시글 제목 입력>>");
				Board board = new Board(boardNo, title, content, writer, null);
				service.createBoard(board);
			} else if (menu == 2) {
				System.out.print("수정하려는 게시글 번호 입력>>");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.print("수정하려는 게시글 내용 입력>>");
				String content = scn.nextLine();
				Board board = new Board(boardNo, null, content, null, null);
				service.modifyBoard(board);
				
			} else if (menu == 3) {
				System.out.print("삭제하려는 게시글 번호 입력>>");
				int boardNo = scn.nextInt();
				scn.nextLine();

				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);
				
			} else if (menu == 4) {
				System.out.print("조회하려는 게시글 번호 입력.");
				int boardNo = scn.nextInt();
				scn.nextLine();

				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());

			} else if (menu == 5) {
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null) {
						System.out.println(bo.toString());
					}
				}
			} else if (menu == 9) {
				break;
			}
		}
		// Service service = new ServiceImpl2();
		// service.getBoard(15);
//		Board[] list = service.getBoardList();
//		for (Board bo : list) {
//			if (bo != null) {
//				System.out.println(bo.toString());
//			}
//		}
	}
}
