public class Resursion5_Gugudan {
	static void gugudan(int level, int count) {
		if(count > 9) {
			return;
		}
		System.out.printf("%d * %d = %d\n", level, count, level*count);
		gugudan(level, ++count);
	}
	
	public static void main(String[] args) {
		System.out.println("Gugudan print");
		gugudan(2, 1);
	}
}
