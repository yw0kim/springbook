package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("애플 스피커 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("애플 스피커 볼륨업");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("애플 스피커 볼륨다운");
	}

}
