package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromes {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		if (str != null || " ".equals(str.trim())) {
			if (testStr(str)) {

				System.out.println("Yes!");
			} else {
				System.out.println("No!");
			}

		}

	}

	public static boolean testStr(String str) {
		char[] strArr = str.toCharArray();

		for (int i = 0, j = strArr.length - 1; i < strArr.length / 2; i++, j--) {
			if (strArr[i] != strArr[j]) {
				return false;
			}

		}
		return true;
	}
}