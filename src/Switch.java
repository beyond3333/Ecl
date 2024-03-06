//두 와일 사용하여 무한루프 계산기만들기 y/n

public class Switch {
	public static void main(String []args) {

Scanner scanner=new Scanner(System.in);      //시스템인 은 키보드.....
	
	int num1 =scanner.nextInt();
	int num2 =scanner.nextInt();
	
	String key = scanner.next();
	String ans = scanner.next();

	
do {                                                //do를 위치를 위쪽에안하는이유는 이미 선언한걸 또 할필ㅇ요없기에

	
	switch (key) {

case "+":
System.out.println((num1+num2));
break;


case "-":

 System.out.println(num1-num2);
break;


case "*":
 System.out.println(num1*num2);
 break;

case "/":
 System.out.println((double)num1/num2);
 break;
default : System.out.println("잘못된입력");



System.out.println("계속 사용하시겠습니까? Y/y");
	}
	
	
ans=scanner.ans();  //	
}
while (ans.equalsIgnoreCase=="y");    // while(ans=='y' ll ans=='y"
		;

}
}
