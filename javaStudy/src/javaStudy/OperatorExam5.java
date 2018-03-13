package javaStudy;

public class OperatorExam5 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		// && : 두개 다 true일때 true
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		// || : 두개 중 하나만 true이면 ture

		int score = 88;
		if (score<=100 && score>=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		// 서로 다른 값일 떄 true
		System.out.println(!b1);
		// 논리값을 바꿈 
	}

}
