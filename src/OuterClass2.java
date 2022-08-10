//Connected with LocalInnerClass
/* 1. 생성방법 
 * 	-지역 클래스가 속해있는 메소드가 호출되어야 하고
 *  -해당 메소드 내에서 클래스 선언이 먼저있고 생성자로 생성 
 * 
 * 
 * 2.제한사항
 * 	1)접근제한자(Access Modifier) 사용 불가
 * 	2)static 사용불가 
 *	3)static 변수/메소드 가질 수 없다.  
 */

public class OuterClass2 {
	private String name = "한지민";
	private static int age = 26;

	public void display() {// Outer class static method

	}

	public static void print() {

	}

	public void mymethod() { 
		boolean flag = true; // Local variable
//		InnerClass2 inner = new InnerClass2(); // 메소드 안에서는 순서가 절대적. 위에서 아래로 
		class InnerClass2 { // Local Class : life cycle을 짧게 하기 위해. 빨리 끊어버리려고/
			// 대부분 이벤트에서 사용 잠깐 나타났다가. 사라지는거. 가장 사용빈도가 낮음  이거쓸빠엔 익명클래스씀 
		private double avg = 89.9; 		//Innerclass2의 member variable
	//	private static char grade = 'C';//InnerClass2의 static Variable
		private void repair() {
			//멤버는 스태틱에 접근 할 수있으니까. 
			System.out.println("나이 = "+age);
			System.out.println("이름 = "+name); //로컬클래스에서 지역변수 접근가능 
			System.out.println("flag = "+flag); // local variable 
			//System.out.println("I'm Local Inner Class's Member Method");
		} // Inner class member method
	//	public static void sort(){}//Inner class static method 
		}
		InnerClass2 inner = new InnerClass2();
		inner.repair(); //out객체의 mymethod행동을 호출하면 inner객체의 repair 를 행동함 
	}

}
