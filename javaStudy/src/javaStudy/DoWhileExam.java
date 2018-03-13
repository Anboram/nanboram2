package javaStudy;

import java.util.Scanner;
public class DoWhileExam {
	public static void main(String[] args) {
		int value =0;
		Scanner scan = new Scanner(System.in);
		//키보드로 값을 입력받는 문장
		do {
			//반복할 문장들
			value = scan.nextInt();
			  System.out.println("입력받은 값 : "+value);
		}while(value !=10);
		
		System.out.println("반복은 종료!!");
	}

	
}
