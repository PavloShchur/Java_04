package zooProject;

import javax.management.RuntimeErrorException;

public class Pinguin extends Bird {
	public void fly() {
		throw new RuntimeException("Не можу літати!");
	}
}
