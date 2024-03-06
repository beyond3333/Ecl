
public class Callbyname {                   //모듈화. 네임,밸류(값의복사),레퍼런스(주소를복사,같은값을참조하고있다) 방식 차이가있을뿐. 
	
	
	public static void main(String []args) {
		
		
		CallByName.disp2();
		CallByName cbn = new CallByName();
		
		cbn.disp1();                   //~~~ . ~~~ 인스턴스메소드의 형식이라 할수있음, 클래스 이름을 통해서 가는건 스테틱 메소드
		cbn.disp1();
		
		int num = 100;
		num=cbn.disp3(num);
		System.out.println(num);  //3
		
		
		String str - new String("Superman");
		//System.out.println(str);
		
		cbn.disp4(str);    //이 순간 콜바이레퍼런스인걸 알게됨
		
		
	}
	
	
	public void disp4(String s) {
		System.out.println(s);
		
	}
		
		public int disp3(int num) {                   //여기의 넘과 위의 넘은 다른것임. 여기인트넘은 매개변수임. 지역변수라서 다섯번째 괄호 나가면 영향 x
			System.out.println(num);
			num++;
			System.out.println(num);
			
			return num;
		}
		
		}
		
		
		
		public void disp() {                                   //인스턴스 메쏘드
			System.out.println{"call by name 1");
		}
		
		
		
		public static void disp() {
			System.out.println{"call by name 2");
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
