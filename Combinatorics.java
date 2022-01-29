package templates;

public class Combinatorics {
	int MAX  = 100005;
	int mod = (int)(1e9+7);
	long fact[], invFact[];

	void setup() {
		fact = new long[MAX];
		invFact = new long[MAX];
		fact[0] = 1;
		for (int i = 1; i < MAX; i++) {
			fact[i] = (i * fact[i - 1]) % mod;
		}
		invFact[MAX - 1] = pow(fact[MAX - 1], mod - 2, mod);
		for (int i = MAX - 2; i >= 0; i--) {
			invFact[i] = (invFact[i + 1] * (i + 1)) % mod;
		}
	}

	long ncr(int n, int r) {
		if (r > n || n < 0 || r < 0)
			return 0;
		return (fact[n] * invFact[r] % mod * invFact[n - r] % mod) % mod;
	}

	public long pow(long base, long exp, long MOD) {
		base %= MOD;
		long res = 1;
		while (exp > 0) {
			if ((exp & 1) == 1)
				res = res * base % MOD;
			base = base * base % MOD;
			exp >>= 1;
		}
		return res;
	}
}
