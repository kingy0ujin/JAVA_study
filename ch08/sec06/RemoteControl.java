package ch08.sec06;

public interface RemoteControl {
	
	//상수 필드 ->public static final 생략
	int MAX_VOLUME  = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 ->public abstract 생략
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메소드 -> 실행부(중괄호) 있음
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			//상수 필드 사용
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
	
}
