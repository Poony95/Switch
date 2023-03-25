// 사용자에게 0~99까지의 정수를 받아 한글표기식으로 출력되도록 하세요

package switchtest;

import java.util.Scanner;
public class Switchtest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, ones, tens;
		
		System.out.println("수를 입력하세요");
		n = sc.nextInt();
		
		if (n > 99 || n < 0) {
			System.out.println("입력 오류입니다.");
			return;
		}
		
		
		if (n == 0) {
			System.out.println("영");
			return;
		}
		
		
		tens = n / 10;
		ones = n % 10;
		
		
		switch(tens) {
		case 0:System.out.print("");break;
		case 1:System.out.print("십");break;
		case 2:System.out.print("이십");break;
		case 3:System.out.print("삼십");break;
		case 4:System.out.print("사십");break;
		case 5:System.out.print("오십");break;
		case 6:System.out.print("육십");break;
		case 7:System.out.print("칠십");break;
		case 8:System.out.print("팔십");break;
		case 9:System.out.print("구십");break;
		}
		
		switch(ones) {
		case 0: System.out.println("");break;
		case 1: System.out.println("일");break;
		case 2: System.out.println("이");break;
		case 3: System.out.println("삼");break;
		case 4: System.out.println("사");break;
		case 5: System.out.println("오");break;
		case 6: System.out.println("육");break;
		case 7: System.out.println("칠");break;
		case 8: System.out.println("팔");break;
		case 9: System.out.println("구");break;
		}
		
		
		
		
		
		
	}

}
