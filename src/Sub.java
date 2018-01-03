/**
 * 
 * 이 클래스는 특정 용도로 사용 클래스나 메소드에는 javadoc처리를 해주는 게 좋음.
 * 
 * @author
 *
 */
public class Sub {

	String var = "안녕하세요";

	public void area(int radius) {
		byte a = 10;
		byte b = 11;
		byte c = (byte) (a + b);

		long y = 2147483648L;

		// 실수는 모두 double로 대체된다.

		float d = 3.14f;
		float e = 4.1928f;

		// 실수는 직접 연산하지 않는다.
		// float f = d+e;(x)
		float f = Float.sum(d, e);

		double g = 5.232;
		double h = 6.323131;

		double i = Double.sum(g, h);

		int number = changeStringToInteger("123");
		int result = number + 1112123;

		//
		int r = (1 + 20) * 34 - 57 / 123;
	}

	/**
	 * 설명입니다.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public int sum(int a, int b) {
		return a + b;
	}

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

}
