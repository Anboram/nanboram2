package javaStudy;

public class SwitchExam {
	
	public static void main(String [] args) {
		//switch, case, default, break
	
		int value = 1;
		
		switch(value) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
			//value가 2를 만나도 switch문 빠져나옴
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("그 외 다른 숫자");
			//만난 값부터 다 실행, 해당되는 값만 실행하려면 break 사용
		}
		String str = "A";
		switch(str) {
		case"A":
			System.out.println("A");
		
		case"B":
			System.out.println("B");
		}
	}

}
