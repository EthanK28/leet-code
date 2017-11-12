package leecode;

import java.util.Arrays;
import java.util.LinkedList;

public class CountPrimes {

	public static void main(String[] args) {
//		System.out.println(countPrimes(10));
//		System.out.println(countPrimes(1));
//		System.out.println(countPrimes(12));
		System.out.println(countPrimes(2));
		System.out.println(countPrimes(3));
	}

	public static int countPrimes(int n) {
		if (n == 1) {
			return 0;
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++){
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
