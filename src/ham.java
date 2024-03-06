
public class ham {
	public static void main(String []args) {
//		// 1
//		for(int i=0; i<3; i++) { 
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 2
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		// 3
//		for(int i=0; i<3; i++) {
//			// 공백
//			for(int j=0; j<2-i; j++) { // 칸
//				System.out.print(" ");
//			}
//			
//			// *
//			for(int j=0; j<2*i+1; j++) { // 칸
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		// 4 
		for(int i=0; i<5; i++) {
			if(i<3) {
				// 공백 2 -> 0
				for(int j=0; j<2-i; j++) { // 칸
					System.out.print(" ");
				}
				
				// * 1 -> 5 2칸씩
				for(int j=0; j<2*i+1; j++) { // 칸
					System.out.print("*");
				}
			} else {
				// 공백 1 -> 2
				for(int j=0; j<i-2; j++) {
					System.out.print(" ");
				}
				
				// *
				// i 3 j 3번
				// i 4 j 1번
				for(int j=0; j<9-2*i; j++) { // 칸
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		// 5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
