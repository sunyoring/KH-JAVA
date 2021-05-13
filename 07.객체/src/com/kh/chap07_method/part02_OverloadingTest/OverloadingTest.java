package com.kh.chap07_method.part02_OverloadingTest;

public class OverloadingTest {
	//오버로딩 : 한 클래스 내에 같은 메소드명으로 정의 할 수 있는 방법
	
	public void test() {
		
	}
	
	//public void test() {}
	
	public void test(int a) {
		
	}
	public void test(int a, String s) {
		
	}
	public void test(String a, int s) {
		
	}
	public void test(int a, int b) {
		
	}
//public void test(int c, int d){} -->매개변수 명과 상관없이 자료형의 갯수와 순서가 다르게 작성 되어야 함.


	public void test(int a, int b, String str) {
		
	}
//	public int test(int a, int b, String str) {} //반환형이 다르다고 오버로딩이 적용되지 않는다.(매개변수가 동일하다)

//	private void test(int a, int b, String str) {} //접근제한자가 다르다고 오버로딩이 적용되지 않는다.
	
	/*결론 
	 * : 오버로딩 - 동일한 메소드명, 매개변수의 자료형과 갯수,순서가 다르게 작성되어야 한다.(접근제한자,반환형은 상관없음)
	 * */
}
