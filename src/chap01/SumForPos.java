package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� �� : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");

		
		// Q10
		int a;
		int b;
		
		do {
			System.out.println("a�� �� : ");
			a = sc.nextInt();
			System.out.println("b�� �� : ");
			b = sc.nextInt();
			if(a >= b) {
				System.out.println("a���� ū ���� �Է��ϼ���!");
				System.out.println("b�� �� : ");
				b = sc.nextInt();
			}
		} while(a >= b);
		
		System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
		
		
		// Q11
		int c;
		int i = 0;
		
		System.out.println("���� �Է� : ");
		c = sc.nextInt();
		
		while (c != 0) {
			c = c/10;
			i++;
		}

		System.out.println("�� ���� " + i + "�ڸ��Դϴ�.");
	}
	
	
}
