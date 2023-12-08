package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceCImpl impl = new InterfaceCImpl();
		
		//구현 객체가 부모 인터페이스 변수에 대입 -> 부모 인터페이스의 추상 메소드만 호출 가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//자식 인터페이스 변수에 대입 -> 모든 추상 메소드 호출 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
