package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("���� ����Ŀ ��ü ����");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("���� ����Ŀ ������");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("���� ����Ŀ �����ٿ�");
	}

}
