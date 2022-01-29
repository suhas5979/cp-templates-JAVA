package templates;

import java.util.ArrayList;

public class PrimeFactorization {
	ArrayList<Integer> primeFactorization(int n) {
		ArrayList<Integer> factorization = new ArrayList<>();
		while (n % 2 == 0) {
			factorization.add(2);
			n /= 2;
		}
		for (int d = 3; d * d <= n; d += 2) {
			while (n % d == 0) {
				factorization.add(d);
				n /= d;
			}
		}
		if (n > 1)
			factorization.add(n);
		return factorization;
	}
}
