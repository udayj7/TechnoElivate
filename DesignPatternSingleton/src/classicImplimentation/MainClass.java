package classicImplimentation;

public class MainClass {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.getInstance());
	}
}
