package javaStudy;

public class ForExam {
	public static void main(String[] args) {
		// int total = 0;
		// for(int i=0; i<=100; i++) {
		// total=total+1;
		// }
		// System.out.println(total);
		//
		// int total2 = 0;
		// for(int j =1;j<=100;j++) {
		// if(j%2!=0) { //나머지가 0이 아닐시 다음 실행문 실행
		// continue; //위의 조건문이 맞을시 pass 다음 루프 실행
		// }
		// total2=total2+j;
		// }
		// System.out.println(total2);
		// }
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
