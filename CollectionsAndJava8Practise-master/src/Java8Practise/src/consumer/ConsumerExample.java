package consumer;

import java.util.function.Consumer;
class Movie{
	String name;
	String result;
	public Movie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	
}
public class ConsumerExample {
	public static void main(String args[]) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Heloo");
		
		
		//CONSUMER CHAINING
		
		
		Consumer<Movie> c1=m->System.out.println(" Movie"+m.name+" released");
		
		Consumer<Movie> c2=m->System.out.println("Movie is "+m.result);
		
		Consumer<Movie> c3=m->System.out.println("Movie is saved");
		
		Consumer<Movie> chainedConsumer=c1.andThen(c2).andThen(c3);
		
		Movie movie=new Movie("Bahubali","Hit");
		
		chainedConsumer.accept(movie);
		
		
		
	}

}
