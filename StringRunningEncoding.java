package templates;

import java.util.ArrayList;

public class StringRunningEncoding {
	ArrayList<pair> runningEncoding(String str) {
		char arr[] = str.toCharArray();
		int n = arr.length;
		ArrayList<pair> encoding = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			char ch = arr[i];
			int j = i;
			int count = 0;
			while (j < n && arr[j] == ch) {
				count++;
				j++;
			}
			encoding.add(new pair(ch, count));
			i = j - 1;
		}
		return encoding;
	}

	class pair {
		char ch;
		int count;

		pair(char ch, int count) {
			this.ch = ch;
			this.count = count;
		}

		@Override
		public String toString() {
			return " [" + ch + ", " + count + "]";
		}

	}
}
