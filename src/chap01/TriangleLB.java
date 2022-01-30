package chap01;

import java.util.Scanner;

public class TriangleLB {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		
		/*
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.println("*");
			System.out.println();
		}
		*/
		
		//triangleLB(n);
		//triangleLU(n);
		//triangleRU(n);
		//triangleRB(n);
		
		spira(n);
		npira(n);
	}
	
	// Q15
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n-i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				if(i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				if(i < j)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}
	}
	
	//Q16
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i-1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Q17
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i-1) * 2 + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
