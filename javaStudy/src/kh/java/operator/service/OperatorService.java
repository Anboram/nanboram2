package kh.java.operator.service;

import java.util.Scanner;

public class OperatorService {
	Scanner sc = new Scanner(System.in);
	
		public void operatorMethod2() {
			Scanner sc = new Scanner(System.in);
		
//			���� : �л��̸�, �г�, ��, ��ȣ, ����(����, M / F), ����(�Ǽ�), �Է� �ް� �Ʒ��� ���� �� �� ��� ��) 3�г� 2�� 24�� ���л� ȫ�浿�� ������ 99.55�̴�.
//			���� : ������ M�̸� ���л�, F�� ���л���� ������ �Ҽ��� 2�ڸ����� ���	
			
			System.out.print("�л��̸� �Է� : ");
			String name = sc.nextLine();
			System.out.print("�г� �Է� : ");
			int grade = sc.nextInt();
			System.out.print("�� �Է� : ");
			int group = sc.nextInt();
			System.out.print("��ȣ �Է� : ");
			String number = sc.next();
			System.out.print("���� �Է� : ");
			String gender = sc.next();
			System.out.print("���� �Է� : ");
			double score = sc.nextDouble();
			
			gender=gender.equals("M")?"���л�":"���л�";
			
			System.out.printf(grade+"�г� "+group+"�� "+number+"��  "+gender+" "+name+"�� ������ %.2f�̴�",score);
			
	}
		public void operatorMethod3() {
		//	���� : ���� �ϳ��Է� �ް� ����� ������١� �ƴϸ� ������� �ƴϴ١�, 0�̸� ��0�̴٣����
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int inum = sc.nextInt();
			
			String inumm = (inum==0?"0�̴�":(inum>0?"�����":"����� �ƴϴ�"));
			System.out.println(inumm);
		}
		public void operatorMethod4() {
			// ���� �ϳ��Է� �ް� ¦���� ¦���� Ȧ���� Ȧ���� ���
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("���� �Է� : ");
			int inum = sc.nextInt();
			
			String inumm= (inum%2==0)?"¦����":"Ȧ����";
			System.out.println(inumm);
		}
		public void calculator() {
			System.out.print("ù��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			int num2 = sc.nextInt();
			System.out.print("���깮�� : ");
			char operator = sc.next().charAt(0);
			
			switch(operator) {
			case '+' : 
				System.out.print(num1+"+"+num2+"="+(num1+num2));
			break;
			case '-' : 
				System.out.print(num1+"-"+num2+"="+(num1-num2));
			break;
			case ('x') : 
			case('X') :
				System.out.print(num1+"x"+num2+"="+(num1*num2));
			break;
			case '/' : 
			if(num2==0) {
				System.out.print("0���� ���� �� �����ϴ�.\n");
				System.out.print(num1+"/"+num2+"="+0);
			}
			else {
				System.out.print(num1+"/"+num2+"="+(num1/num2));
			}
			break;
			}
			
		}
		public void totalCalculator() {
			System.out.print("���� 1 �Է� : ");
			int num1 = sc.nextInt();
			System.out.print("���� 2 �Է� : ");
			int num2 = sc.nextInt();
			int startnum=0;
			int endnum = 0;
			int sum=0;
			
			if(num1<num2) {
				startnum =num1;
				endnum = num2;
				for(startnum=num1;startnum<=endnum;startnum++) {
					sum+=startnum;
				}
				System.out.print(num1+"����"+num2+"���� �������� �հ� : "+sum);
			}
			else {
				startnum =num2;
				endnum = num1;
			
			for(startnum=num2;startnum<=endnum;startnum++) {
				sum+=startnum;
			}
			System.out.print(num2+"����"+num1+"���� �������� �հ� : "+sum);
		}}
		public void profile() {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			String gender = sc.next();
			System.out.print("���� : ");
			String personality = sc.next();
		}
		public void sungjuk() {
			String name;
			System.out.print("�л� �̸� : ");
			name = sc.next();
			int grade;
			System.out.print("�г� : ");
			grade = sc.nextInt();
			int classnumber ;
			System.out.print("�� : ");
			classnumber = sc.nextInt();
			int number;
			System.out.print("��ȣ : ");
			number = sc.nextInt();
			char gender;
			System.out.print("���� (M/F) : ");
			gender = sc.next().charAt(0);
			double score;
			System.out.print("���� : ");
			score =sc.nextDouble();
			char result ;
			String gender2;
			
			if(score>=90) {
				result='A';
			}else if(score>=80&&score<90) {
				result='B';
			}else if(score>=80&&score<90) {
				result='B';
		    }else if(score>=70&&score<80) {
			result='C';
			}else if(score>=60&&score<70) {
				result='D';
		    }else {
			result='F';
			}
		
			
			
			gender2 = gender=='M'?"���л�":"���л�";
	
		System.out.printf(grade+"�г� "+classnumber+"�� "+number+"�� "+gender2+" "+name+"�� ������ %.2f �̰� "+result+"�����Դϴ�.",score);




		}
}

