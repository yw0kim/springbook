package polymorphism;

public class LgTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV PowerOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV PowerOff");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV VolumeUp");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV VolumeOff");
	}

}
