package javaStudy;

public class OperatorExam3 {
	public static void main(String [] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c); //곱하기 먼저
		System.out.println((a-b)*c); //빼기 먼저
		
		System.out.println(a>5 && b>5); //비교연산자 먼저 논리연산자는 그 후 
       /*	 false $$ true
		&& : 양쪽이 모두 ture 일 경우 ture */
		System.out.println(++a -5); //증감연산자가 먼저 ++ㅁ : 
		
	    System.out.println(a); //a+1 =6
	    
		System.out.println(a++ -5); //증가하기 전에 산술 연산자 실행 즉,1
		
		System.out.println(a); //a= 6+1
	
	
	} 

}
