import java.util.*;

public class ex_01 {

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int arr [] = {10,20,30,40,50};
			
				System.out.println("찾고싶은 값을 입력하세요");
				int z = sc.nextInt();
				
			for(x=0; x<arr.length; x++){
					
			if(z==arr[x]){
				System.out.println(z+"값은"+x+"번 위치에 있습니다");
			}
			
			}
}
}
