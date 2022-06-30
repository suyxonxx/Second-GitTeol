package polymorphism;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
	System.out.println("SamsungTV_powerOn");
	}
	@Override
	public void powerOff() {
	System.out.println("SamsungTV_powerOff");
	}
	@Override
	public void volumeUp() {
	System.out.println("SamsungTV_volumeUp");
	}
	@Override
	public void volumeDown() {
	System.out.println("SamsungTV_volumeDown");
	}
}
