/* static은 멤버에 접근할수없다. 아직 메모리에 생기지도 않았기에 
멤버는 static에 접근가능하다. 이미 메모리에 올라와있기에 
 그럼 스태틱은 아예 접근못함? 아니다 . 주소있으면된다. 
* class에 접근할때는 주소 필요없다.그대신 바깥클래스 이름이 필요함. 
*
*/



public class StaticInnerCalssDemo {
public static void main(String[] args) {
	OuterClass.print();// print에 접근, age에 간접적으로 접근한것 
	OuterClass.InnerClass inner = new OuterClass.InnerClass();
	System.out.println(inner.avg);// 멤버는 이유 여하를 불문하고 주소가 있어야해 그래서 inner라는 객체가 생성된 주소가 있어서 그 주소의 데이터인 avg에 접근 할 수 있는것 
	System.out.println(OuterClass.InnerClass.flag); // 스태틱이니까 주소 필요없고 클래스이름만 적어주면 찾아온다. 
	/*show는 멤버메소드니까 주소가필요해 inner 에만들어진 객체의행동을(show) 한것 */
	inner.show();
	
}
}
