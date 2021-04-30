package com.kh.variable;

public class C_Overflow {
	
	public void printVariableSize() {
	
		System.out.println("byte의 크기 : " + Byte.BYTES + "byte");
		System.out.println("short의 크기 : " + Short.BYTES + "byte");
		System.out.println("int의 크기 : " + Integer.BYTES + "byte");
		System.out.println("long의 크기 : " + Long.BYTES + "byte");
		
		System.out.println("float의 크기 : " + Float.BYTES + "byte");
		System.out.println("double의 크기 : " + Double.BYTES + "byte");
		System.out.println("char의 크기 : " + Character.BYTES + "byte");
	}
	
	public void oveflow() {
		
		byte bNum = 127;
		System.out.println(bNum);
		
		byte result = (byte)(bNum +3);
		
		System.out.println("result : " + result); //  -> -128 -> -127 -> -126
		
		
		int num1 = 1000000; //100만
		int num2 = 700000; // 70만

		int result2 = num1* num2; // 7조
		System.out.println("result : " + result2);
		
		long result3 = num1 * (long)num2; //곱셈 자체에 결과값이 int 형으로 되기 때문에 그순간 이미 오버플로우가 발생, 
											//그래서 둘 중 하나라도 long형으로 강제 변환 시켜줘야한다.
		System.out.println("result : " + result3);

	}

}
