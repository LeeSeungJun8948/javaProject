
package objects2;

import java.util.Arrays;
/*1. 제목 저자 출판사 가격 입력
2. 회원정보 - 이름,id(1사람만) 책대여[5]
3. 도서대여 - 책 제목을 찾아서 대여해줌 ( 없으면 " 책없음" 출력)
4. 도서반납 - 책 제목을 찾아서 반납
5. 도서목록 - getbookinfo
*/
import java.util.Scanner;

public class BookExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Book[] bookList = new Book[10];
		Member user = new Member();

		while (true) {
			System.out.println("1)도서정보 입력 | 2)회원정보 | 3)도서대여 | 4)도서반납 | 5)도서목록 | 6)프로그램 종료 |");
			System.out.print("선택 >");
			int menu = scn.nextInt();
			if (menu == 1) {
				for (int i = 0; i < bookList.length; i++) {

					System.out.print("제목을 입력하세요 > ");
					String title = scn.next();
					System.out.print("저자를 입력하세요 > ");
					String name = scn.next();
					System.out.print("출판사를 입력하세요 > ");
					String com = scn.next();
					System.out.print("가격을 입력하세요 > ");
					int sell = scn.nextInt();
					Book book = new Book(title, name, com, sell);
					bookList[i] = book;
					System.out.println("입력을 종료 하려면 0을 눌러주세요. / 계속 입력하려면 아무숫자나 누르세요 > ");
					int a = scn.nextInt();
					if (a == 0) {
						break;
					} else {
					}
				}
			} else if (menu == 2) {
				System.out.print("회원 ID를 입력하세요 > ");
				user.setId(scn.next());
				System.out.print("회원 이름을 입력하세요 > ");
				user.setName(scn.next());
			} else if (menu == 3) {
				System.out.print("대여 할 책제목을 입력 하세요 > ");
				String checkName = scn.next();
				int cnt = 0;
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && bookList[i].getBookName().equals(checkName)) {
						cnt++;
						user.rent(bookList[i]);
						break;
					}
				}
				if (cnt == 0) {
					System.out.println("없는 책 입니다.");
				}
			} else if (menu == 4) {
				System.out.print("반납 할 책제목을 입력 하세요 > ");
				String checkName = scn.next();
				int cnt = 0;
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && bookList[i].getBookName().equals(checkName)) {
						cnt++;
						user.overdue(bookList[i]);
						break;
					}
				}
				if (cnt == 0) {
					System.out.println("없는 책 입니다.");
				}
			} else if (menu == 5) {
				user.getBookInfo();

			} else if (menu == 6) {
				break;
			}
			System.out.println("프로그램 종료");
		}
	}
}
