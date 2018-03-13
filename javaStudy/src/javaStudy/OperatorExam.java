package javaStudy;

public class OperatorExam {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
//		변수 앞에 +가 붙어도 부호가 바뀌는 것이 아니라 부호 비트 그대로 유지
		System.out.println(i3);
//		-가 붙을시 부호비트가 바뀜
		
		int i4 = ++i3; // i3 = i3 +1;
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++; // i3 = i3+1;
		System.out.println(i5);
		System.out.println(i3); 
//		
//		int i = 5; 
//		int j = 2;
//		
//		System.out.println(i + j);
//		System.out.println(i - j);
//		System.out.println(i * j);
//		System.out.println(i / j); // 정수이기 때문에 2
//		System.out.println(i / (double)j); // j를 정수로 강제 형변환 하여서 2.5
//		System.out.println(i % 2);
	}

}
