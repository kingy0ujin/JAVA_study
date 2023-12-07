package ch07.sec09;

public class InstanceofExample {
	//main()메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
	
		//person이 참조하는 객체가 student 타입인지 확인
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo: "+ student.studentNo);
			student.study();
		}
	
		//java 12부터 가능함
		/*if (person instanceof Student student){
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}*/
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);

	}

}
