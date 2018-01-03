
public class HelloMain {

	// 접근제한자 리턴타입 함수명 (String) {
	// public
	// private 자기 클래스안
	// protected
	// (default)
	// }

	public static void main(String args[]) {

		System.out.println("Hello Java!!!");

		int a = 2 + 3;
		int b = 2 - 3;
		int c = 2 * 3;
		int d = 2 / 3; // 0.6777인데 먼저 형변환이 일어나면서, 0으로 출력
		int e = 5 % 3;
		int f = 10 % 3;
		double dou = 5.0 % 4.2;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("dou : " + dou);
	}

}
