import java.util.Date;

public class DeprecationDemo {
public static void main(String[] args) {
	Date now = new Date();
	
// 예전에는 이렇게했다.
	System.out.println(now.getYear()+1900); // 줄이 그어져있다. 지금은안쓰는거 
	// api가서 찾아보면 뭐로 바뀌었는지 가르쳐준다. 
	//As of JDK version 1.1, replaced by Calendar.get(Calendar.YEAR) - 1900.


}
}
