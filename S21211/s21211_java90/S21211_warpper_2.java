public class S21211_warpper_2 {

	public static void main(String[] args) {
		System.out.println("--기본박싱 및 언박싱-------------");
		
		Integer is1 = new Integer(127);
		Integer is2 = new Integer("127");
		
		int si1 = is1.intValue();
		int si2 = is2.intValue();
		
		System.out.println("기본박싱is1:"+is1+"언방식si1:"+si1);
		System.out.println("기본박싱is1:"+is2+"언방식si1:"+si2);
		
		System.out.println("기박is1:"+System.identityHashCode(is1)+"언박:"+System.identityHashCode(si1));
		System.out.println("기박is2:"+System.identityHashCode(is2)+"언박:"+System.identityHashCode(si2));
	}

}
