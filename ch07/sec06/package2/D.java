package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	public D() {
		super();//A()생성자 호출
	}
	public void method1() {
		this.field = "value";
		this.method();
	}
	//protected 접근 제한자를 가진 클래스는 직접 객체를 생성해서 사용하는 것이 불가능
	/*public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}*/
}
