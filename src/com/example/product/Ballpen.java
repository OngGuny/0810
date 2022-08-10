package com.example.product;//클래스를 저장하기위한 패키지()폴더 생성하는것 

public class Ballpen {
	//constructor 에도 접근제한자 4개를 붙일 수 있따.  생성자에게 private 는 쓰지 말라는것 .
	Ballpen() {} 
	
	
	
	public String name = "Monami Ballpen";
	//protected String name = "Monami Ballpen";
		//이러면 자식클래스만 접근가능 쓰려는 클래스에서 extends 붙여주면됨 
	// String name = "Monami Ballpen";
}// 여기서 퍼블릭을 지우면 클래스까지는 접근가능한데 그 안에있는 데이터에는 접근할수없다
