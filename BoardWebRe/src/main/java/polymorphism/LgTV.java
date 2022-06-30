package polymorphism;

public class LgTV implements TV {
	@Override
	public void powerOn() {
	System.out.println("LgTV_powerOn");
	}
	@Override
	public void powerOff() {
	System.out.println("LgTV_powerOff");
	}
	@Override
	public void volumeUp() {
	System.out.println("LgTV_volumeUp");
	}
	@Override
	public void volumeDown() {
	System.out.println("LgTV_volumeDown");
	}
}
