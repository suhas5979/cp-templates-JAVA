package templates;

import java.util.*;

public class Sieve {
	int MAX = 100005;
	boolean sieve[];
	int pf[];
	ArrayList<Integer> primes;

	void setup() {
		sieve = new boolean[MAX + 1];
		pf = new int[MAX + 1];
		for (int i = 1; i <= MAX; i++) {
			pf[i] = i;
		}
		sieve[0] = sieve[1] = true;
		for (int i = 2; i * i <= MAX; i++) {
			if (!sieve[i]) {
				for (int j = i * i; j <= MAX; j += i) {
					sieve[j] = true;
					pf[j] = i;
				}
			}
		}
		primes = new ArrayList<>();
		for (int i = 2; i <= MAX; i++) {
			if (!sieve[i]) {
				primes.add(i);
			}
		}
	}
}
