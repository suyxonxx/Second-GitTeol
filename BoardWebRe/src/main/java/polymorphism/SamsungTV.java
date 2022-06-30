package polymorphism;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("===>SamsungTV 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("SamsungTV 객체 초기화 작업 처리");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV 객체 삭제 전에 처리할 로직 처리");
	}
	
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
