package javaStudy;

public class OperatorExam3 {
	public static void main(String [] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c); //���ϱ� ����
		System.out.println((a-b)*c); //���� ����
		
		System.out.println(a>5 && b>5); //�񱳿����� ���� �������ڴ� �� �� 
       /*	 false $$ true
		&& : ������ ��� ture �� ��� ture */
		System.out.println(++a -5); //���������ڰ� ���� ++�� : 
		
	    System.out.println(a); //a+1 =6
	    
		System.out.println(a++ -5); //�����ϱ� ���� ��� ������ ���� ��,1
		
		System.out.println(a); //a= 6+1
	
	
	} 

}
