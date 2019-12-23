package Winter;

import java.util.*;

public class OtpGenrate {
	public static char[] geek_Password(int len) {
		String Capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		Random rm = new Random();
		//String str = Capital + Small + numbers + symbols;
		String str = numbers;
		char password[] = new char[len];
		for (int i = 0; i < password.length; i++) {
			password[i] = str.charAt(rm.nextInt(str.length()));

		}

		return password;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] otp = new char[n];
		otp = geek_Password(n);
		for (int i = 0; i < otp.length; i++) {
			System.out.print(otp[i]);
		}
	}
}
