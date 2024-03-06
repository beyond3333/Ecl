import java.util.Scanner;

public class Hello {

	public static void main(String []args) {     // 프로그램을 시작해주고 끝내줌.
	
	
	
	
	
	//import java.lang.*    //랭 하위에 있는 모든것을 사용하겠다..근데 안해도 알아서 임포트되어있음.

	
	
	
	Scanner scanner=new Scanner(System.in);      //시스템인 은 키보드.....
	
	int num1 =scanner.nextInt();
	int num2 =scanner.nextInt();
	
	String op = scanner.next();
	//char key = key2.charAt(0);

 if (op.equals("+")) {
	 System.out.println(num1+""+op+""+num2+"="+(num1+num2));
 }else if (op.equals("+")) {
	 System.out.println(num1+""+op+""+num2+"="+(num1+num2));
 }else if (op.equals("+")) {
		 System.out.println(num1+""+op+""+num2+"="+(num1+num2));
	 }else if (op.equals("+")) {
	 System.out.println(num1+""+op+""+num2+"="+((double)num1+num2));
 }
	 else {
		 System.out.println("잘못된입력");
}
	
	
}
}
