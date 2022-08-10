/* connected with StaticInnerCalssDemo
 * Nested(static) Inner Class
 * 1. 생성법: OuterClass.InnerClass 참조변수 = new OuterClass.InnerClass();
 * 2. 제한사항 : Static Inner Class 는 OuterClass의 멤버변수/멤버메소드 접근 불가 
 *
 *
 *
 */
public class OuterClass {
	private static int age = 26;
	private String name = "한지민";// outer class의 멤버변수. 생성자없이 그냥 지정해줌 간단하게하려고

	public void display() { // outer class의 member method
		System.out.println("Name = " + this.name);
	}

	public static void print() { // outer class static method 나이 찍어내기
		System.out.println("Age=" + age);// age에접근하려면 private니까 얘를 통해서 접근해야한다.
	}
//inner class
	/* public */

	static class InnerClass { // static class 
		public double avg = 89.5;// inner class member variable
		public static boolean flag = true; //inner class static variable
		/*method create*/public void show() {// Inner class member method
	//display(); // 주소없어서 접근불가. 객체없어서 행동을못함 
			print(); //같은 static method라 접근가능 
			//		System.out.println("나이 = "+age); // 멤버 메소드는 스태틱변수에 접근할수있다. 
	//	System.out.println("이름 = "+name); //name은 스태틱변수가 아니니까 name의 주소가 필요하다 스태틱(클래스)에서 멤버(outer의 멤버변수 name)에 접근 할 수 없다. 주소필요 	
		//현재까지 아우터클래스의 객체를 만들지 않았기 때문에. name 이 들어갈 객체가 없다.그래서 못찾는것
	
		}
	public static void printout() {
		System.out.println("나이 = "+age);
	}
	
	}
	

}
