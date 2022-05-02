class A {
	int a;
	
	void funcA() {
		System.out.println("A!!");
	}
	
	A() {}
	A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b;
	
	@Override
	void funcA() {
//		super.funcA(); //상위클래스의 Method 호출
		System.out.println("B!!");
	}
	void funcB() {
		System.out.println("b!");
	}
	
	B () {}
	B(int a, int b) {
		super(a);
		this.b = b;
	}
}

class C extends B {
	int c;
	
	@Override
	void funcA() {
		super.funcA(); //상위클래스의 Method 호출
		System.out.println("C!!");
	}
	void funcC() {
		System.out.println("c!");
	}
	
	public C() {
		this(0, 0, 0);
	}
	public C(int i, int j) {
		this(i, j, 0);
	}
	public C(int i, int j, int k) {
		super(i, j);
		c = k; //매개변수와 이름이 겹치지 않을 경우, this를 생략할 수 있음.
	}
}

class D extends A {
	int d;
	
	D() {
		super(100);
	}
	void funcD() {
		System.out.println("d!");
	}
}

//C의 객체 생성을 통해 상위 클래스로도 접근.
public class ABC_Test {
	public static void main(String[] args) {
		C cc = new C(10, 20, 30);
		System.out.println(cc.a + ", " + cc.b + ", " + cc.c);
		
		cc.funcA(); //overriding
		cc.funcB();
		cc.funcC();
		System.out.println("-----------");
		
		A ca = new C(10, 20, 30);
		System.out.println(ca.a);
//		System.out.println(ca.b); //접근 불가
//		System.out.println(ca.c); // 접근 불가
		
		ca.funcA();
//		ca.funcB(); //접근 불가
//		ca.funcC(); //접근 불가
		System.out.println("-----------");
		
//		형변환을 통해 접근 가능
		System.out.println(((C)ca).b);
		System.out.println(((C)ca).c);
		
		((C)ca).funcB();
		((C)ca).funcC();
		System.out.println("-----------");
		
	} //end of main  
}
