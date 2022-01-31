package templates;

public class BitMagic {
	int leastSignificantBit(int n) {
		// remember sign bit
		int set = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & (1 << i)) != 0) {
				set = i + 1;
				break;
			}
		}
		return set;
	}

	int leastSignificantBit(long n) {
		// remember sign bit
		int set = 0;
		for (int i = 0; i < 64; i++) {
			if ((n & (1L << i)) != 0) {
				set = i + 1;
				break;
			}
		}
		return set;
	}

	int mostSignificantBit(int n) {
		// remember sign bit
		int set = 0;
		for (int i = 31; i >= 0; i--) {
			if ((n & (1 << i)) != 0) {
				set = i + 1;
				break;
			}
		}
		return set;
	}

	int mostSignificantBit(long n) {
		// remember sign bit
		int set = 0;
		for (int i = 63; i >= 0; i--) {
			if ((n & (1L << i)) != 0) {
				set = i + 1;
				break;
			}
		}
		return set;
	}
}
