package chap02;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		return digits;
	}
	
	// Q6
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i = 0; i <= digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
	
	// Q7
	static int cardConvRD(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKMNOPQRSTUVWXYZ";
		
		do {
			if(digits == 0) {
				System.out.println(r + "|       " + x);
				System.out.println(" +---------");
			}
			else if(digits > 0) {
				if(x > 10) {
					System.out.println(r + "|       " + x + " --- " + x % r);
					System.out.println(" +---------");
				}
				else {
					System.out.println(r + "|        " + x + " --- " + x % r);
					System.out.println(" +---------");
				}
				
			}
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		return digits;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);
			
			/*
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for (int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			*/
			
			/*
			// Q6
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for (int i = 0; i <= dno; i++)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			*/
			
			// Q7
			dno = cardConvRD(no, cd, cno);
			System.out.print(cd + "�����δ� ");
			for (int i = dno - 1; i >= 0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = sc.nextInt();
		} while (retry == 1);

	}

}
