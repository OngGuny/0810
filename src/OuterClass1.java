//connected with MemberInnerClassDemo
/*
 * 2.제한사항 : Member inner class는 static 변수와 static method를 가질 수 없다. 
 *		-멤버는 멤버에 접근가능 
 *
 *
 *
 */

public class OuterClass1 extends DeprecationDemo{
	private static int age = 26;
	private String name = "한지민";// outer class의 멤버변수. 생성자없이 그냥 지정해줌 간단하게하려고

	public void display() { // outer class의 member method
		System.out.println("Name = " + this.name);
	}

	public static void print() { // outer class static method 나이 찍어내기
		System.out.println("Age=" + age);// age에접근하려면 private니까 얘를 통해서 접근해야한다.
	}

	 class InnerClass1 extends Main{ //member class 
		public double avg = 89.5;// inner class member variable
	//	public static boolean flag = true;
		// inner class static variable
		/* method create */public void show() {// Inner class member method
			print(); // 멤버는 바깥의 스태틱에 접근가능 
			display(); // 멤버는 멤버에 가능 
			System.out.println("나이 = " + age);
			System.out.println("이름 = " + name);// 멤버는 멤버에 접근가능. 

		}

//		public static void printout() {
//			System.out.println("나이 = " + age);
//		}

	}// InnerClass1 이랑 Outerclass1 이 상속을 하나씩 받았다고보자 
	 /*이러면 InnerClass1은 자기 자신꺼, 바깥(Outerclass1)꺼, 부모(Main)꺼, 바깥의 부모(Deprecation)꺼 총 4개 쓸 수 있다.  
	  * 
	  */
}
