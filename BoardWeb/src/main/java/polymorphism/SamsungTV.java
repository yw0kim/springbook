package polymorphism;

// alt + shift + s : ������ �ڵ� ���� ����Ű 
public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV ������(1)");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV ������(2)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		super();
		System.out.println("SamsumgTV ������(3)");
		this.speaker = speaker;
		this.price = price;
	}
	// alt + shift + s create setter/getter
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() is called");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() is called");
		this.price = price;
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
		System.out.println("SamsungTV PowerOn (Price : " + price + ")");
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
