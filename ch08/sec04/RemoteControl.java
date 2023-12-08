package ch08.sec04;

public interface RemoteControl {
	
	//상수 필드 ->public static final 생략
	int MAX_VOLUME  = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 ->public abstract 생략
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
