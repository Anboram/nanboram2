package javaStudy;

public class OperatorExam {
	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
//		���� �տ� +�� �پ ��ȣ�� �ٲ�� ���� �ƴ϶� ��ȣ ��Ʈ �״�� ����
		System.out.println(i3);
//		-�� ������ ��ȣ��Ʈ�� �ٲ�
		
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
//		System.out.println(i / j); // �����̱� ������ 2
//		System.out.println(i / (double)j); // j�� ������ ���� ����ȯ �Ͽ��� 2.5
//		System.out.println(i % 2);
	}

}
