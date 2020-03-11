package polymorphism;

// alt + shift + s : ������ �ڵ� ���� ����Ű 
public class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	
	

	public SamsungTV(SonySpeaker speaker, int price) {
		super();
		System.out.println("SamsumgTV ������(3)")
		this.speaker = speaker;
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("SamsungTV ������(1)");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV ������(2)");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ");
	}
	
	public void destoryMethod() {
		System.out.println("��ü ������ ó�� ����");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV PowerOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV PowerOff");
	} 

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		// System.out.println("SamsungTV VolumeUp");
		// speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		// System.out.println("SamsungTV VolumeOff");
		// speaker = new SonySpeaker();
		speaker.volumeDown();		
	}

}
