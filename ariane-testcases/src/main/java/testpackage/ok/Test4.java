package testpackage.ok;


// inline class declaration
public class Test4 {

	public static final String str = "test";
	
	void test1() {
		// TODO rajouter un type d'appel CALLABLE pour Test4 -> Sysem.out.println sans tenir compte de l'interface éphemere
		Thread t = new Thread(new Runnable()  {
			@Override
			public void run() {
				System.out.println(str);
			}
		});

	}
}