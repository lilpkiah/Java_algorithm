package chap01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i <= n; i++) 
			sum += i;
		
		// Q7
		/*
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i != n) 
				System.out.println(i + " + ");
			else if (i == n)
				System.out.println(i + " = " + sum);
		}
		*/
		
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
	
	//Q9
	static int sumof(int a, int b) {
		int sum = 0;
		
		if(a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		}
		else if(b > a) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		}
		
		return sum;
		
	}

}
