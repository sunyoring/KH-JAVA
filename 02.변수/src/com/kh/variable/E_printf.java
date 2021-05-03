package com.kh.variable;

public class E_printf {
	//System.out.printf("포맷", 출력하고자하는 값, 값, ...);
	  // 출력하고자 하는 값들이 제시된 포맷(형식)에 맞춰서 출력만 진행 --> 한줄띄어쓰기는 안함
	  // %d : 정수
	  // %c : 문자
	  // %s : 문자열 또는 문자도 가능
	  // %f : 실수
	
	/*   \t : 정해진 공간만큼 띄어쓰기
		 \n : 출력하고 다음라인으로 옮김
		 
		 정렬방법
			%5d : 5칸을 확보하고 오른쪽 정렬
			%-5d : 5칸을 확보하고 왼쪽 정렬
			%.2f : 소수점 아래 2자리까지만 표시

	*/
	public void printfMethod() {
		int iNum1 =10;
		int iNum2 = 20;
		
		System.out.printf("%d\n",iNum1);
		System.out.printf("%d\n",iNum1,iNum2);
//		System.out.printf("%d%d\n",iNum1); --> 에러발생 : 두번째 포맷에 들어갈 값을 지정하지 않음.
		System.out.printf("%d %d\n",iNum1,iNum2);
		
		System.out.printf("%d + %d = %d\n",iNum1,iNum2,iNum1+iNum2);
		System.out.printf("%5d\n", iNum1);
		
		
		float fNum = 1.2345458f;
		double dNum = 4.53;
		
		System.out.printf("%f\t%f\n",fNum,dNum); 
		//%f - 실수 값을 소수점 아래 6번째 자리까지 보임. 넘기면 반올림, 아래값이 없으면 0으로 표기.
		
		System.out.printf("%.3f\t%.3f\n",fNum,dNum);
	
		char ch ='a';
		String str = "Hello";
		
		System.out.printf("%c %s\n",ch,str);
		System.out.printf("%c %s\n",ch,ch); //%s는 char형도 받을 수 있다.
		
		System.out.printf("%C %S\n",ch,str); //대문자로
		
		
		//참고
		System.out.println("100을 10진수 : " + 100);
		System.out.println(0x100); //0x 16진수 16^2
		System.out.println(0100); //8진수 8^2
		System.out.println(0144); //8^2 + 8^1*4 + 8^0+4
		

	}
}
