//스레드를 만드는 방법.
//스레드 동시성 메소드를 사용하기위함  전화  !=무전기 
//
public class AnnoymousInnerClassDemo2 {
public static void main(String[] args) {
	//기존의 스레드를 재사용하겠다는것. 이게 익명클래스
	Thread t = new Thread() {
	@Override
public void run() {	
	System.out.println("나는 메인 메소드");
	}
};
	t.run();
}
	
	//이렇게 스레드의 자식을 만들지 말고,
//	class MyTread extends Thread{
//		@Override
//		public void run() {
//			System.out.println("나는 쓰레드");
//		}
//	}
}
