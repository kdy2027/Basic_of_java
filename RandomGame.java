package ex;

import java.util.*;

public class RandomGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		final int si = 10;
		int[] arr = new int[si];
		
		// 좌석번호 출력
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------");

		// 빈좌석 출력
		for (int i = 0; i < si; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();
		
		// 예약 인원 입력
		System.out.println("예약할 인원을 입력하세요");
		int d = sc.nextInt();

		// 좌석 선택 반복문

		for (int a = 1; a <= d; a++) {
		
			if(a>1){
				System.out.println("예약을 계속하시려면 1번 예약을 취소하시려면 2번을 눌러주세요");
				int w = sc.nextInt();
				
				if(w==1){
					System.out.println("좌석번호를 입력하세요  종료는 -1");
					int z = sc.nextInt();
					z = z - 1;

					// 반복문 탈출
					if (z == -1) {
						System.out.println("초기화면으로 돌아갑니다");
						break;
					}


					// 예약 중첩 출력문
					if (arr[z] == 1) {
						System.out.println("이미 예약된 자리입니다");
						a--;
					}

					// 예약값 호출
					arr[z] = 1;

					System.out.println("--------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("--------------------");

					// 예약값 출력
					for (int i = 0; i < si; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				}
				
				
				if(w==2){
					System.out.println("예약을 취소할 좌석번호를 입력하세요  종료는 -1");
					int z = sc.nextInt();
					z = z - 1;

					// 반복문 탈출
					if (z == -1) {
						System.out.println("초기화면으로 돌아갑니다");
						break;
					}


					// 예약 중첩 출력문
					if (arr[z] == 0) {
						System.out.println("빈 좌석입니다");
						a--;
					}

					// 예약값 호출
					arr[z] = 0;

					System.out.println("--------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("--------------------");

					// 예약값 출력
					for (int i = 0; i < si; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
					a--;
				}
				
				
			}
		
			
			
			if(a==1) {
			System.out.println("좌석번호를 입력하세요  종료는 -1");
			int z = sc.nextInt();
			z = z - 1;

			// 반복문 탈출
			if (z == -1) {
				System.out.println("초기화면으로 돌아갑니다");
				break;
			}


			// 예약 중첩 출력문
			if (arr[z] == 1) {
				System.out.println("이미 예약된 자리입니다");
				a--;
			}

			// 예약값 호출
			arr[z] = 1;

			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------");

			// 예약값 출력
			for (int i = 0; i < si; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			}
		}
		}
}