package ch07.sec06.package1;

public class B {
	
	public void method() {
		//같은 패키지라 사용 필드, 메소드, 생성자 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
