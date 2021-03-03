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
		Book b1 = new Book(null, null, null, 0);
		Book b2 = new Book(null, null, null, 0);
		Book b3 = new Book(null, null, null, 0);
		Book b4 = new Book(null, null, null, 0);
		Book b5 = new Book(null, null, null, 0);
		Book b6 = new Book(null, null, null, 0);
		Book b7 = new Book(null, null, null, 0);
		Book b8 = new Book(null, null, null, 0);
		Book b9 = new Book(null, null, null, 0);
		Book b10 = new Book(null, null, null, 0);
		Book[] bookList = new Book[10];
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		bookList[5] = b6;
		bookList[6] = b7;
		bookList[7] = b8;
		bookList[8] = b9;
		bookList[9] = b10;
		Member user = new Member();

		while (true) {
			System.out.println("1)도서정보 입력 | 2)회원정보 | 3)도서대여 | 4)도서반납 | 5)도서목록 | 6)프로그램 종료 |");
			System.out.print("선택 >");
			int menu = scn.nextInt();
			if (menu == 1) {
				for (int i = 0; i < bookList.length; i++) {
					System.out.print("제목을 입력하세요 > ");
					bookList[i].setBookName(scn.next());
					System.out.print("저자를 입력하세요 > ");
					bookList[i].setAuthor(scn.next());
					System.out.print("출판사를 입력하세요 > ");
					bookList[i].setCompany(scn.next());
					System.out.print("가격을 입력하세요 > ");
					bookList[i].setSell(scn.nextInt());
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
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i].getBookName() == checkName) {
						user.rent(bookList[i]);
					}
					else {
			
					}
				}
			} else if (menu == 4) {

			} else if (menu == 5) {

			}
		}
	}
}
