package ex;

import java.util.*;

public class RandomGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		final int si = 10;
		int[] arr = new int[si];
		
		// �¼���ȣ ���
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------");

		// ���¼� ���
		for (int i = 0; i < si; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();
		
		// ���� �ο� �Է�
		System.out.println("������ �ο��� �Է��ϼ���");
		int d = sc.nextInt();

		// �¼� ���� �ݺ���

		for (int a = 1; a <= d; a++) {
		
			if(a>1){
				System.out.println("������ ����Ͻ÷��� 1�� ������ ����Ͻ÷��� 2���� �����ּ���");
				int w = sc.nextInt();
				
				if(w==1){
					System.out.println("�¼���ȣ�� �Է��ϼ���  ����� -1");
					int z = sc.nextInt();
					z = z - 1;

					// �ݺ��� Ż��
					if (z == -1) {
						System.out.println("�ʱ�ȭ������ ���ư��ϴ�");
						break;
					}


					// ���� ��ø ��¹�
					if (arr[z] == 1) {
						System.out.println("�̹� ����� �ڸ��Դϴ�");
						a--;
					}

					// ���ప ȣ��
					arr[z] = 1;

					System.out.println("--------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("--------------------");

					// ���ప ���
					for (int i = 0; i < si; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				}
				
				
				if(w==2){
					System.out.println("������ ����� �¼���ȣ�� �Է��ϼ���  ����� -1");
					int z = sc.nextInt();
					z = z - 1;

					// �ݺ��� Ż��
					if (z == -1) {
						System.out.println("�ʱ�ȭ������ ���ư��ϴ�");
						break;
					}


					// ���� ��ø ��¹�
					if (arr[z] == 0) {
						System.out.println("�� �¼��Դϴ�");
						a--;
					}

					// ���ప ȣ��
					arr[z] = 0;

					System.out.println("--------------------");
					System.out.println("1 2 3 4 5 6 7 8 9 10");
					System.out.println("--------------------");

					// ���ప ���
					for (int i = 0; i < si; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
					a--;
				}
				
				
			}
		
			
			
			if(a==1) {
			System.out.println("�¼���ȣ�� �Է��ϼ���  ����� -1");
			int z = sc.nextInt();
			z = z - 1;

			// �ݺ��� Ż��
			if (z == -1) {
				System.out.println("�ʱ�ȭ������ ���ư��ϴ�");
				break;
			}


			// ���� ��ø ��¹�
			if (arr[z] == 1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�");
				a--;
			}

			// ���ప ȣ��
			arr[z] = 1;

			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------");

			// ���ప ���
			for (int i = 0; i < si; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			}
		}
		}
}