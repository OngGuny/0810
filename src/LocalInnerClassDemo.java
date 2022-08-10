
public class LocalInnerClassDemo {
public static void main(String[] args) {
	// InnerClass2는 그냥 호출하지 못하고 mymethod 불러줘야 호출할수있음 
	OuterClass2 out = new OuterClass2();
	out.mymethod(); //이렇게 불러주고 나서야. 
}
}
