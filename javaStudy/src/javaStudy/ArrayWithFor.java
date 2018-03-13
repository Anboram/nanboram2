package javaStudy;

public class ArrayWithFor {
	public static void main(String[] args) {
		int [] iarray = new int[100];
		iarray[0]=1;
		iarray[1]=2;
		
		System.out.println(iarray.length);
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i]=i+1;
		}
		int sum =0;
		for(int i=0;i<iarray.length;i++) {
			//int sum 선언시 매번 반복할때마다 변수 선언되므로 ㄴㄴ
			sum=sum+iarray[i];
		}
			System.out.println(sum);
	}

}
