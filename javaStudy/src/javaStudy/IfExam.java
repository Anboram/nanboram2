package javaStudy;

public class IfExam {
	public static void main(String [] args) {
		int x =50;
		int y =60;
		
  /*	if(x < y) {
		System.out.println("x는 y보다 작습니다."); 
		System.out.println("test");
		// 조건 만족시에만 실행, 불만족시 아무것도 안뜸
		}
		
		if(x<y)
			System.out.println("x는 y와 같습니다."); // 이 줄만 해당
	     	System.out.println("test");
	//블럭을 아무것도 안줬을때는 해당하는 한줄만 실행
	     	
	     	*/
	     if(x==y) {
	    	 System.out.println("x는 y와 같습니다.");
	     }else if(x<y){
	    	 System.out.println("x와 y는 작습니다.");
	     }else {
	    	 System.out.println("x는 y와 다릅니다.");
	     }
	}

}
