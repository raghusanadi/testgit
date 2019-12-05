package test;

public class ConstrTest {

	public static void main(String[] args) {
		A c1 =  new B("Test");
		C c = new C();
	}

}

class A {
	A() {
		this("1", "2");
		System.out.println("A's default constr");	
	}

	A(String s, String t) {
		this(s + t);
	}

	A(String s) {
		System.out.println(s);
	}
}

class B extends A {
	B(String s) {
		System.out.println(s);
	}

	B(String s, String t) {
		this(t + s + "3");
	}

	B() {
		super("4");
	}
}
class C extends B{
	
}