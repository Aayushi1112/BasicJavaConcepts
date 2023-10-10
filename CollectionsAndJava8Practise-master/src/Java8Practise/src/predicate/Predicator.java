package predicate;
@FunctionalInterface
public interface Predicator<T> {
	public boolean test(T t);

}
