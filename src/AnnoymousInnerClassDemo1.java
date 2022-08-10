import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
//
//class Product {
//	private String name;
//	private int price;
//}
import java.util.List;

public class AnnoymousInnerClassDemo1 {
	public static void main(String[] args) {
		List<Product>list=
				Arrays.asList(new Product("볼펜",200),
						new Product("키보드",10000),
						new Product("연필",100),
						new Product("마우스",5000));
						// 가격의 오름차순으로 정렬하고싶다.
		Collections.sort(list, new Comparator<Product>() {
								//기존의 것을 재정의하는것 comparator 의 정체는 인터페이스였고, 익명객체를 인터페이스 자리에 넣어주던가 인터페이스의 자식을 넣어주던가 해야함  
	//static <T> void	sort​(List<T> list, Comparator<? super T> c)
	//주소없이     리턴타입  정렬해  배열을   인터페이스 따라     
			@Override//오름차순으로 소팅하는걸 재정의 
			public int compare(Product front, Product back) {
				return front.price-back.price;
			}
		});System.out.println(list);
					//  소팅의대상,product자식클래스
		
		
		
		
//		List<Integer> list = Arrays.asList(3,4,5,6,2,5,7,2,4,5); // 얘네들을 배열로 만들어주는게 .aslist
//		Collections.sort(list,new Comparator<Integer>() {
//		//sort (,) 이 배열(list)이 소팅의 대상이다. compareTo써야한다며. 자식만들어서 넣는거말고 직접 익명클래스 넣어줄꺼야 
//			@Override
//			public int compare(Integer front, Integer back) {
//				return front - back ;
//			}
//		});//
//		System.out.println(list);
	}
}
//자식 만들면 일 2번하니까 아예 이렇게 바로 적어주는것 익명클래스를. 익명 객체. 이름없이 걍 바로 new때려주는것 
/*	new Comparator<Integer>() {
			@Override
			public int compare(Integer front, Integer back) {
				return front - back ;
			}
		}
 * 
 */
