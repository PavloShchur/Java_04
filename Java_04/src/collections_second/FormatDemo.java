package collections_second;

import java.util.Formatter;

public class FormatDemo {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("����������� %s ���� ������: %d %f", "�������� Java", 10, 98.6);
		System.out.println(fmt);
		fmt.close();
	}

}
