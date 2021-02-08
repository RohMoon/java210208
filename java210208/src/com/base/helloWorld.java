package com.base;

public class helloWorld {
  int age = 20;//전역변수의 위치
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hw = new HelloWorld();
		hw.age = 31;
		System.out.println("당신의 나이는  "+hw.age+" 입니다");
		System.out.println("2차 수정한 부분입니다.")
	}

}
