class Tv {
	int channel;
	
	void channelup() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends Tv {
	boolean caption = true;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class S21211_70_1 {
	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		sTv.caption = false;
		sTv.channel = 10;
		sTv.channelup();
		System.out.println(sTv.channel);
		sTv.displayCaption("2학년12반 전체");

		sTv.displayCaption("2학년12반 사랑한다 친구야~");
	}
}
