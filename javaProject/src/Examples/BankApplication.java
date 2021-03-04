package Examples;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.print("선택>");

			int menu = scanner.nextInt();

			if (menu == 1) {
				createAccount();

			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			}
		}
	}

	private static void createAccount() {

		System.out.println("계좌생성");
		System.out.print("계좌번호:");
		String num = scanner.next();
		System.out.print("계좌주:");
		String name = scanner.next();
		System.out.print("초기입금액:");
		int money = scanner.nextInt();
		Account account = new Account(num, name, money);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "  " + accountArray[i].getOwner() + "  "	+ accountArray[i].getBalance());
			}
		}
	}
	private static void deposit() {
		System.out.println("예금");
		System.out.print("계좌번호 : ");
		String num = scanner.next();
		
		
		Account account = findAccount(num);
		if(num != null) {
			System.out.print("예금액 : ");
			int money = scanner.nextInt();
			account.setBalance((account.getBalance()+money));
			System.out.println("예금이 완료 되었습니다.");
		} else {
			System.out.println("없는 계좌 입니다.");
		}
	}
	private static Account findAccount(String ano) {
		for (int i = 0; i<accountArray.length; i++) {
			if (ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
	}
}
