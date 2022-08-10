import java.util.Arrays;

public class EnumDemo1 {
public static void main(String[] args) {
	Season season = Season.SUMMER;
	System.out.println(season);
	Season[] array = Season.values();
	//System.out.println(Arrays.toString(array));
	for(Season season1 : array) {
		System.out.print(season1+",");
		System.out.println(season1.ordinal()+","+season1.getValue());
	}

}
}//클래스도 있고 인터페이스도 있어서 enum을 그렇게 많이 쓰진않는데 다른점은, 
//범위/경계를 지정할수있다는거. enum의 목표다. 
