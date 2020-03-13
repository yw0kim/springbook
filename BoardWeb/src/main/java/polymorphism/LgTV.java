package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	
	// @Qualifier("apple")
	// @Resource(name="apple")
	@Autowired
	private Speaker speaker;
		
	public LgTV() {
		System.out.println("LgTV Created");
	}
	
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
		// System.out.println("LgTV VolumeUp");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		// System.out.println("LgTV VolumeOff");
		speaker.volumeDown();
	}

}
