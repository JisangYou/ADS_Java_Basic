/**
 * 
 * �� Ŭ������ Ư�� �뵵�� ��� Ŭ������ �޼ҵ忡�� javadocó���� ���ִ� �� ����.
 * 
 * @author
 *
 */
public class Sub {

	String var = "�ȳ��ϼ���";

	public void area(int radius) {
		byte a = 10;
		byte b = 11;
		byte c = (byte) (a + b);

		long y = 2147483648L;

		// �Ǽ��� ��� double�� ��ü�ȴ�.

		float d = 3.14f;
		float e = 4.1928f;

		// �Ǽ��� ���� �������� �ʴ´�.
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
	 * �����Դϴ�.
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
