class Data_1 {
	int value;
	Data_1(){ //compile 시 class 파일에 자동 생성
		
	}
}

class Data_2 {
	int value;
	Data_2 (){ // 기본 생성자가 없으면 error
		
	}
	Data_2(int x) {
		int value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // 기본 생성자가 없다고 가정하에 compile error 발생
	}
}
