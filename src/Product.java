import java.util.Comparator;

public class Product implements Comparator<Product>{
public int price;
private String name;
public Product( String name, int price) {
	this.name=name;
	this.price=price;
}
//가격 기준으로 소팅하고싶다. 

	@Override
	public int compare(Product front, Product back) {
		return front.price - back.price ;
}
	@Override
	public String toString() {
		return "이름 = "+this.name+", 가격="+this.price;
	}
}
