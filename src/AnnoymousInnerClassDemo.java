//가장많이씀 
//이름이 없는게 아니라 그 클래스를 재활용하는거 
public class AnnoymousInnerClassDemo {
	public static void main(String[] args) {
//이떄까지 한 방식 	
		// car.print();
///*private static public 다안된다 */Car car = new Car() {// 문장의 시작 
//	@Override 
//	public void print() {
//		System.out.println("Hello, Smith");
//	}
//	}; // 세미콜론 까먹으면 안된다. 문장으 끝
//	car.print();
		
		// 핵심은 상속안받고 재정의할수있다
		//객체를 만들고, 그 주소를 클래스변수에 저장한게 아니라서 객체를 만들고 밑에서 1회용으로 써버리고 없에는것. 그게 익명객체 
		
		
		
		MyInterface mi = new MyInterface() {
			@Override // myinterface를 재정의 할꺼야
			public int calculate(int a, int b) {
				return a + b;
			}
		};// 세미콜론 꼭 쓰기
		int result = mi.calculate(5, 7); //부모자식간의 관계도 아니면서 재정의하는것 
		System.out.println("result = " + result);
//--------------------------------------------------------------------------	
	mi = new MyInterface() { 
			@Override
			public int calculate(int a, int b) {
				return a * b;
			}
		};
		result = mi.calculate(5, 7);
		System.out.println("result = " + result);
	}
/*static <T> void	sort​(List<T> list, Comparator<? super T> c)
 * api 가서 sort 기능 저기의 comparator 에 익명클래스자체를 쓸 수있다.변수로 써도 되고  예시 ㄱㄱ
 * 
 */
}
