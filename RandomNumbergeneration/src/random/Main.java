package random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int value = rd.nextInt(100000, 1000000);
		System.out.println(value);
	}

}
