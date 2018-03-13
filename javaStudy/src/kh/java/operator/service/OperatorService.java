package kh.java.operator.service;

import java.util.Scanner;

public class OperatorService {
	Scanner sc = new Scanner(System.in);
	
		public void operatorMethod2() {
			Scanner sc = new Scanner(System.in);
		
//			내용 : 학생이름, 학년, 반, 번호, 성별(문자, M / F), 성적(실수), 입력 받고 아래와 같이 출 력 출력 예) 3학년 2반 24번 남학생 홍길동은 성적이 99.55이다.
//			조건 : 성별이 M이면 남학생, F면 여학생출력 성적은 소수점 2자리까지 출력	
			
			System.out.print("학생이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("학년 입력 : ");
			int grade = sc.nextInt();
			System.out.print("반 입력 : ");
			int group = sc.nextInt();
			System.out.print("번호 입력 : ");
			String number = sc.next();
			System.out.print("성별 입력 : ");
			String gender = sc.next();
			System.out.print("성적 입력 : ");
			double score = sc.nextDouble();
			
			gender=gender.equals("M")?"남학생":"여학생";
			
			System.out.printf(grade+"학년 "+group+"반 "+number+"번  "+gender+" "+name+"은 성적이 %.2f이다",score);
			
	}
		public void operatorMethod3() {
		//	내용 : 정수 하나입력 받고 양수면 “양수다” 아니면 “양수가 아니다”, 0이면 “0이다＂출력
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int inum = sc.nextInt();
			
			String inumm = (inum==0?"0이다":(inum>0?"양수다":"양수가 아니다"));
			System.out.println(inumm);
		}
		public void operatorMethod4() {
			// 정수 하나입력 받고 짝수면 짝수다 홀수면 홀수다 출력
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("정수 입력 : ");
			int inum = sc.nextInt();
			
			String inumm= (inum%2==0)?"짝수다":"홀수다";
			System.out.println(inumm);
		}
		public void calculator() {
			System.out.print("첫번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();
			System.out.print("연산문자 : ");
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
				System.out.print("0으로 나눌 수 없습니다.\n");
				System.out.print(num1+"/"+num2+"="+0);
			}
			else {
				System.out.print(num1+"/"+num2+"="+(num1/num2));
			}
			break;
			}
			
		}
		public void totalCalculator() {
			System.out.print("정수 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 2 입력 : ");
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
				System.out.print(num1+"부터"+num2+"까지 정수들의 합계 : "+sum);
			}
			else {
				startnum =num2;
				endnum = num1;
			
			for(startnum=num2;startnum<=endnum;startnum++) {
				sum+=startnum;
			}
			System.out.print(num2+"부터"+num1+"까지 정수들의 합계 : "+sum);
		}}
		public void profile() {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("성별 : ");
			String gender = sc.next();
			System.out.print("성격 : ");
			String personality = sc.next();
		}
		public void sungjuk() {
			String name;
			System.out.print("학생 이름 : ");
			name = sc.next();
			int grade;
			System.out.print("학년 : ");
			grade = sc.nextInt();
			int classnumber ;
			System.out.print("반 : ");
			classnumber = sc.nextInt();
			int number;
			System.out.print("번호 : ");
			number = sc.nextInt();
			char gender;
			System.out.print("성별 (M/F) : ");
			gender = sc.next().charAt(0);
			double score;
			System.out.print("성적 : ");
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
		
			
			
			gender2 = gender=='M'?"남학생":"여학생";
	
		System.out.printf(grade+"학년 "+classnumber+"반 "+number+"번 "+gender2+" "+name+"의 점수는 %.2f 이고 "+result+"학점입니다.",score);




		}
}

