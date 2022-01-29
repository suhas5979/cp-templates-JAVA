package templates;

import java.util.ArrayList;

public class Primes {
	ArrayList<Integer> primes;
	int MAX = 100005;

	void setup() {
		boolean sieve[] = new boolean[MAX];
		sieve[0] = sieve[1] = true;
		for (int i = 2; i * i < MAX; i++) {
			if (!sieve[i]) {
				for (int j = i * i; j < MAX; j += i) {
					sieve[j] = true;
				}
			}
		}
		primes = new ArrayList<>();
		for (int i = 2; i < MAX; i++) {
			if (!sieve[i]) {
				primes.add(i);
			}
		}
	}
}
