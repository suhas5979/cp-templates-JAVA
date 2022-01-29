package templates;

import java.util.ArrayList;

public class Divisors {
	ArrayList<Long> getDivisors(long n) {
		ArrayList<Long> res = new ArrayList<>();
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				res.add(i);
				if ((n / i) != i)
					res.add(n / i);
			}

		}
		return res;
	}
}
