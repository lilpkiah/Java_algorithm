package chap02;

import java.util.Scanner;

public class ReverseArray {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i - 1);
	}
	
	// Q2
	static void swap2(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		
	}
	
	static void reverse2(int[] a) {
		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
			swap2(a, i, a.length - i - 1);
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
	
	
	// Q3
	static int sumOf(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++)
			sum += a[i];

		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		// Q2
		reverse2(x);
		
		// Q3
		System.out.println("sum = " + sumOf(x));
		
		/*
		reverse(x);
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		*/

	}

}
