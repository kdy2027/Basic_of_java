import java.util.*;

public class ex_01 {

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int arr [] = {10,20,30,40,50};
		int y;
			
				System.out.println("ã����� ���� �Է��ϼ���");
				int z = sc.nextInt();
				
			for(x=0; x<arr.length; x++){
					
			y = arr [x];
					
			if(z==arr[x]){
				System.out.println(z+"����"+x+"�� ��ġ�� �ֽ��ϴ�");
			}
			
			}
}
}