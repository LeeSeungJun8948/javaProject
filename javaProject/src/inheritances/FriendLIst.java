package inheritances;
import java.util.Scanner;
public class FriendLIst {
	public static void main(String[] args) {
		// scanner 클래스
		// 1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6. 종료
		Friend[] friends = new Friend[10];
		Scanner scn = new Scanner(System.in);
		/*
		 * friends[0] = new Friend("홍길동", "01089487486"); friends[1] = new
		 * ComFriend("김길동", "01012121212", "총무부서"); friends[2] = new UnivFriend("박길동",
		 * "01045454545", "역사학과");
		 * 
		 * for (Friend friend : friends) { if (friend != null) {
		 * System.out.println(friend.toString()); } }
		 */

		while (true) {
			System.out.println("_____________________________________________________________________________________");
			System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.전체목록 | 5.친구이름 검색 | 6.종료 ");
			System.out.println("_____________________________________________________________________________________");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.print("이름 : >> ");
				String name = scn.nextLine();
				System.out.print("번호 : >> ");
				String phone = scn.nextLine();
				Friend friend = new Friend(name, phone);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
			} else if (menu == 2) {
				System.out.print("이름 : >> ");
				String name = scn.nextLine();
				System.out.print("번호 : >> ");
				String phone = scn.nextLine();
				System.out.print("학과 : >> ");
				String major = scn.nextLine();
				UnivFriend univfriend = new UnivFriend(name, phone, major);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = univfriend;
						break;
					}
				}
			} else if (menu == 3) {
				System.out.print("이름 : >> ");
				String name = scn.nextLine();
				System.out.print("번호 : >> ");
				String phone = scn.nextLine();
				System.out.print("부서 : >> ");
				String department = scn.nextLine();
				ComFriend comfriend = new ComFriend(name, phone, department);
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = comfriend;
						break;
					}
				}
			} else if (menu == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}
			} else if (menu == 5) {
				
				for (int i = 0; i < friends.length; i++) {
					System.out.print("찾을 친구 이름을 입력하세요 >> ");
					String search = scn.nextLine();
					if (friends[i].getName().equals(search) && friends[i] != null) {
						System.out.println(friends[i].toString());
						break;
					}
				}
			} else if (menu == 6) {
				break;
			}
		} // end of while
		System.out.println("프로그램 종료");
	} // end of main

} // end of class