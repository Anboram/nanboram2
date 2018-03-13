package javaStudy;


public class VariableExam {

	public static void main(String[] args) {
		int count;
		
		count = 10;
		
		count = 20;
		 double average = 11.1;
	//		count는 정수 이기 때문 11.1은 double 써야함 
		 
		String name = "carami";
	//	자바는 문자열을 저장할떄 String 씀	 
		System.out.println(count);
	//		마지막 count값이 출력됨
		System.out.println(average);
		System.out.println(name);

		
	    int totalCount;
	    totalCount = count+count ;
//	    totalCount는 20+20
	    System.out.println(totalCount);
	   
	}
}
