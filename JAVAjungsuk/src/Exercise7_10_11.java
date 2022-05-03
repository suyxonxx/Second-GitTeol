class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int i = 0;
	int[] prevCh = new int[1]; //처음에는 값을 하나만 집어넣으면 되므로, 길이가 1인 배열을 생성
	
//	Setter에서 channel값을 받아 gotoPrevChannel Method로 가져와서
//	배열을 통해 이전 채널 값들을 저장한 후 getChannel 호출
	public void gotoPrevChannel() {
		int[] temp = new int[prevCh.length + 1];
		for(int j = 0; j < prevCh.length; j++)
			temp[j] = prevCh[j];
		prevCh = temp;
		
//		if문의 조건식을 아래와 같이 설정한 이유 : 이전 채널로 돌아가는 과정을 수행하기 위해서는
//		최소한 2개의 채널 값이 저장되는 과정이 선행되어야 한다. 따라서, 채널 변경 과정을 통해 배열 값을 저장할 수 있는
//		index의 최소값은 2이다. 또한, main Method에서 채널 값의 입력을 요청하기 위해 Setter Method를 호출한 경우에는
//		요청된 값이 배열에 저장될 것이지만, main Method에서 gotoPrevChannel Method를 호출한 경우에는
//		요청된 값이 존재하지 않으므로 int type array의 default값인 0이 저장될 것이기 때문이다.
		if(i >= 2 && prevCh[i] == 0)
			prevCh[i] = prevCh[i - 2];
		i++;
		getChannel();
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public void setChannel(int c) {
		this.channel = c;
		prevCh[i] = channel;
		gotoPrevChannel();
	}
	public int getChannel() {
//		gotoPrevChannel Method를 거친 후 i값이 1 증가하였으므로, array index에서 1을 다시 빼주었음.
		channel = prevCh[i - 1];
		return channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
}

public class Exercise7_10_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
	}
}
