package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

		
		// Q10
		int a;
		int b;
		
		do {
			System.out.println("a의 값 : ");
			a = sc.nextInt();
			System.out.println("b의 값 : ");
			b = sc.nextInt();
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
				System.out.println("b의 값 : ");
				b = sc.nextInt();
			}
		} while(a >= b);
		
		System.out.println("b - a는 " + (b-a) + "입니다.");
		
		
		// Q11
		int c;
		int i = 0;
		
		System.out.println("정수 입력 : ");
		c = sc.nextInt();
		
		while (c != 0) {
			c = c/10;
			i++;
		}

		System.out.println("그 수는 " + i + "자리입니다.");
	}
	
	
}
