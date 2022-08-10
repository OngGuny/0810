/**
 * 
 * @author <font size = '5' color='green'>GGG </font>
 * @version <b>1.0</b>
 * @since <i>2022-08-01 </i>
 * 
 */
public enum Season { // enum은 enum상수가 제일 먼저와야함 . 다른코드도 오면안됨
	SPRING(100), SUMMER(50), FALL(1000), WINTER(500);

	private int value;

	Season(int i) { // Spring 에 100을 넣으면 생성자가 100을 저장. 얘는 생성자인데 왜앞이 비어있지? public 쓰면안된다. 
		this.value = i;
	}

	public int getValue() {
		return this.value;
	}
}
