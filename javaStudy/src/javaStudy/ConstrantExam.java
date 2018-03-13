package javaStudy;

public class ConstrantExam {

	public static void main(String[] args) {
		int i;
		i = 10;
		i = 5;
		System.out.println(i);
		final int J;
		J = 10;
		
//		J = 5; 
//		상수에는 값을 담을 수 잇는 기회가 단 한번만 허락
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
	
		System.out.println(circleArea);
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		System.out.println(totalPrice);
	}
}
