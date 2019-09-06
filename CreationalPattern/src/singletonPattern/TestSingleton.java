package singletonPattern;

public class TestSingleton {
	
	public static void main(String[] a) {
		SingletonClass inst1=SingletonClass.getInstance();
		inst1=SingletonClass.getInstance();
	}

}
