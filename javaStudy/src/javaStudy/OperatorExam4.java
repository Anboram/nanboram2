package javaStudy;

public class OperatorExam4 {
	public static void main(String[] args) {
		int i = 10; // 단순 대입 연산자
		int j = 10;
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);
		
		i += 10; // i = i+ 10; 복합 대입 연산자
		System.out.println(i); //10+10

		System.out.println(i -=5); //20-5 
		System.out.println(i); //15, i= i-5;
	}
}
