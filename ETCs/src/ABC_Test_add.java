
public class ABC_Test_add {

	public static void main(String[] args) {
		A a = new A(); //X
		C c = new C(); //O
		A ac = new C(); //O
		
		System.out.println(a.a);
		a.funcA();

//		참조변수에 연결된 인스턴스의 클래스가
//		형변환을 통해 연결받고자 하는 참조변수의 클래스보다 상위 클래스인 경우
//		접근 자체가 거부되어 에러처리됨
//		->언제나 우리들의 빛과 소금 instanceof 연산자를 사용할 것을 잊지 말자
//			B ba = (B) a;
//		System.out.println(a.a);
//		System.out.println(ba.a);

//		접근 범위를 좁히는 건 문제가 되지 않음.
		B bc = (B) c;
		System.out.println(c.a);
		System.out.println(bc.a);
		
		B bac = (B) ac;
		System.out.println(ac.a);
		System.out.println(bac.a);
	}
}
