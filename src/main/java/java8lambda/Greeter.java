package java8lambda;

import java.util.function.Function;

public class Greeter {

	public void greet(Greeting greeting) {
	greeting.perform();	
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		greeter.greet(new Greeting() {
			
			public void perform() {
				System.out.println("Hello World");
				
			}
		});
	}

	
}
