package javaStudy;

public class TypeCastingExam {
	public static void main(String[] args) {
		int x = 5000;
		long y =x;
//		묵시적 형변환
//		작은타입을 큰타입으로 변경
		
		System.out.println(y);
		
		long x2 = 5;
 	//int y2 = x2;
//		long타입 값을 int타입 값에 넣을수 없음 but 넣으려면 (형변환)해야함
//		큰타입을 작은타입으로 변경
		
	int y2 =(int) x2;
//		강제 형변환
 	
 	System.out.println(y2);
	}
}
