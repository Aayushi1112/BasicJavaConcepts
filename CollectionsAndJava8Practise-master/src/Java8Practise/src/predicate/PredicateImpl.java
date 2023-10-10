package predicate;

public class PredicateImpl implements Predicator<Integer> {

	@Override
	public boolean test(Integer i) {
		if (i > 10) {
			return true;
		} else
			return false;

	}
	}

	


