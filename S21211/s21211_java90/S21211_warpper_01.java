public class S21211_warpper_01 {

	public static void main(String[] args) {
		int i1 = 126;
		int i2 = 126;
		
		System.out.println("기본 타입 int-------------------");
		System.out.println("기본 값 i1"+i1+" HashCode:"+System.identityHashCode(i1));
		System.out.println("기본 값 i1"+i2+" HashCode:"+System.identityHashCode(i2));
		
		Integer is1 = new Integer(126);
		Integer is2 = new Integer(126);
		

	}

}
