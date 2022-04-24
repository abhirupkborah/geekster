package Fundamentals;

import java.util.*;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a>b && a>c) {
				System.out.println("a is the greatest");
			}
			else if(b>a && b>c) {
				System.out.println("b is the greatest");
			}
			else {
				System.out.println("c is the greatest");
			}
		}
	}


