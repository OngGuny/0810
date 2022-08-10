import com.example.finance.Money;
import com.example.libs.Car;
import com.example.product.Ballpen;
// 오늘 비쥬얼코드에서 만든 메인들 가져온다 
//0810 우클릭. 빌드 패스. 컨피규어. 클래스 패스 . 애드 익스터널... 자바외부에서 만든 클래스니까.
//거기서 jar 파일 저장한곳 찾아서 열어주고 적용시켜주면 referenced Libraries 생긴다 
//그리고 임포트하면된다. 

/* package (윈도우에서 폴더생성 )
 * 생성된 클래스나 인터페이스나 enum -> 참조형 타입객체들을 분류해서 저장하는 방법 
 * - javac -d <Path> : package의 시작폴더는 -d옵션의 경로에 생ㅅㅓㅇ된다.
 * 
 * import 
 * 1. -com 을 찾는 위치. 1) 현재 디렉토리 2)Reference library 에서 찾고 3) classpath 에서 찾고 4) class not found 
 */ // 클래스 어디있는지 알게하려면 3가지 방법외에 없다. 그ㅐ서 자르를 클래스 변수에 저장. 

//그럼 스캐너는 어다서??
//java.bace. ...
// 2번째꺼는 너무 많아서 못건들고 1,3번꺼만 썼던것 

public class Main {
	public static void main(String[] args) {
		//Car sonata = new Car("Silver Sonata");
		com.example.libs.Car sonata = new com.example.libs.Car("Sliver Sonata"); // 이렇게 쓰는걸 FQDN 이라함. fully qualified domain name 
		//근데 너무 길다 
		//위에서 임포트함걍 
		System.out.println(sonata); // sonata.toString
		Ballpen monami = new Ballpen();
		System.out.println(monami.name);

		
	
	com.example.finance.Money lotto=
			new com.example.finance.Money();
			System.out.println(lotto.balance);
	
	} // 또 어디있는지 모름. 알려주던가 , 임포트하던가. 
 
}
