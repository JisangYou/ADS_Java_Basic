# ADS04 Java 

## 수업 내용
- 출력, 변수, 연산, 주석, method, class 등 전반적인 기초문법

## Code Review

1. method
```Java
	public int sum(int a, int b) {
		return a + b;
	}

    // String 타입이 들어왔을때 int형변환하는 법
    //int와 char는 WrapperClass의 이름인 Integer와 Character를 사용한다. 아래 예시가 있음.
	public int changeStringToInteger(String word) {
		return Integer.parseInt(word);
	}

	public long changeStringToLong(String word) {
		return Long.parseLong(word);
	}

	public String changeNumberToString(int number) {
		// return Integer.toString(number);
		return number + "";

	}
```
- 리턴값이 있는 method 예제코드 + 형변환
- public 리턴타입 함수명 (타입 변수명){
    코드
    리턴타입이 있다면 return + 해당 리턴타입에 맞게 정의
    리턴타입이 void라면 생략 가능
}
- 형변환시에는 위와 같이 parseInt, ParseLong을 사용한다.(WrapperClass는 Class 타입 이므로 Integer.parseInt로 사용한다.)
- int를 String으로 형변환 할때는 위와같이 [+""]를 사용할 수 있다.

## 보충설명
- 자바는 다른언어에 비해 변수타입을 철저하게 지킨다. 
- Method는 함수라고 보면된다. 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내어놓는 기능을 한다. 
- 반복적인 코드가 있다면 Method를 사용해서 코드의 비효율성을 줄일 수 있다.
- Method 하나에는 하나의 기능만을 담는게 좋으며, Method명을 정할때는 해당 기능을 바로 알아볼 수 있게 신중하게 정한다.(협업시, 추후에 코드가 복잡해질때 쉽게 그 기능을 파악할 수 있다.)
- 데이터 타입 : 컴퓨터에서 변수를 만들 때 반드시 지정해줘야 하는 것으로, 변수 선언시 데이터 타입의 크기에 맞는 공간이 메모리 상에서 할당되어 데이터의 저장이 가능해짐
- 기본 타입 - byte,int,long,float,double,boolean,char 같은 변수타입들은 각각 특징이 있다. 이러한 특징에 맞게 상황에 따라 사용해야함.(기본적인 설명은 인터넷에 잘 나와있으므로 생략)
- 레퍼런스(참조) 타입(reference type)
① 배열에 대한 레퍼런스
 기본형으로 만들수도 있고, 참조형으로 만들수 있음.
② 클래스에 대한 레퍼런스
  String, Wrapper
③ 인터페이스에 대한 레퍼런스
  Wrapper class는 기본형을 class로 감싼형태이다.
- 표현되어 있는 데이터가 서로 다른 타입으로 사용되었을때 그 데이터의 표현 방식을 다른 타입으로 변환하는 것을 타입변환이라고 하는데, 이는 자동으로 원래의 자료형보다 큰 자료형(높은 등급의 자료형)으로 변환
- 강제로 타입을 변환하는 것을 casting이란 함. ex) int i = (int)12.345 -> 이처럼 타입을 ()감싸서 표현하고, 강제로 형변환시에는 손실되는 부분이 생길 수 있음으로 유의한다.

출처: http://roseee.tistory.com/entry/Java-변수-선언하기-데이터-타입과-타입-변환 [VIOLET QUARTZ]

## TODO

- 자료형 기본형, 참조형 대한 깊은 이해 필요함.
- 자동으로 메모리관리를 해주는 자바를 공부하면서 자칫 놓칠 수 있는 메모리 부분에 대한 공부
- 클래스와 객체지향에 대한 고민
- callbyvalue, callbyreference 부분 공부하기

- 참고 블로그 http://jdm.kr/blog/213



## Retrospect

- 무심코 따라치기 쉬운 예제코드를 하나하나 뜯어보니 참 많은 내용이 있었음.
- 비전공자이다 보니 놓치는 근본적인 지식들에 대한 공부가 필요함.
- 간단한 프로그램을 만들때는 모르지만 나중에 복잡다단화 해지면서는 이러한 기본기가 중요해질 것 같다는 생각이 듬
- 시간 날때마다 틈틈히 눈에 잘 보이지 않는, 무심코 사용하는 문법, 기능들에 대한 연구를 해봐야 할 것 같음.

## Output
- 생략
