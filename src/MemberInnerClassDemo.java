
public class MemberInnerClassDemo {
public static void main(String[] args) {
	OuterClass1 out = new OuterClass1(); //바깥 클래스의 참조변수 . 객체 
	OuterClass1.InnerClass1 inner = out.new InnerClass1();
	//생성자를 호출하려면 new 써야함  멤버는 주소가 있어야함. 바깥에 주소 만듦. 주소 의 new 생성자 
	System.out.println(inner.avg);
	
}
}
