package javaStudy;

public class TypeCastingExam {
	public static void main(String[] args) {
		int x = 5000;
		long y =x;
//		������ ����ȯ
//		����Ÿ���� ūŸ������ ����
		
		System.out.println(y);
		
		long x2 = 5;
 	//int y2 = x2;
//		longŸ�� ���� intŸ�� ���� ������ ���� but �������� (����ȯ)�ؾ���
//		ūŸ���� ����Ÿ������ ����
		
	int y2 =(int) x2;
//		���� ����ȯ
 	
 	System.out.println(y2);
	}
}
