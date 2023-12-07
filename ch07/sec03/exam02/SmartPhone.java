package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super(model, color); //생략가능 - > 컴파일시 자동추가
		System.out.println("SmartPhone(String model, String color)생성자 실행됨");
		
	}
}
