package singletonPattern;

public class SingletonClass {
	
	private SingletonClass() {
		System.out.println("Constructor called...");
	}
	
	public static SingletonClass getInstance() {
		return InnerClass.instance;
	}
	
	public static class InnerClass {
		public static  SingletonClass instance= new SingletonClass();
	}

}
