package templates;

public class BinaryExponentiation {
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
