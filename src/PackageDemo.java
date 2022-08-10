import java.math.MathContext;

import com.example.product.Ballpen; // public인지 먼저봄. 아니라면 못가져옴 

public class PackageDemo extends Ballpen {
	public static void main(String[] args) {
//	Ballpen ballpen = new Ballpen();
//	PackageDemo pd = new PackageDemo();
		Math m = new Math(); //못본다. 애초에 매스 클래스는 스태틱변수로 전부 만들어놨기 때문에 생성자가 필요가없다. 그러니 아예 막아놈 
	}
}
