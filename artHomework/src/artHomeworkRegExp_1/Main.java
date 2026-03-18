package artHomeworkRegExp_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String str = "+79261234567\r\n"
				+ "89261234567\r\n"
				+ "79261234567\r\n"
				+ "+7 926 123 45 67\r\n"
				+ "8(926)123-45-67\r\n"
				+ "123-45-67\r\n"
				+ "9261234567\r\n"
				+ "79261234567\r\n"
				+ "(495)1234567\r\n"
				+ "(495) 123 45 67\r\n"
				+ "89261234567\r\n"
				+ "8-926-123-45-67\r\n"
				+ "8 927 1234 234\r\n"
				+ "8 927 12 12 888\r\n"
				+ "8 927 12 555 12\r\n"
				+ "8 927 123 8 123";
		
		String[] arr = str.split("\n");
		
		
		
		
		for (String string : arr) {
			System.out.println(string + " = " + isValidTelephoneNumber(string));
		}

	}
	
	public static boolean isValidTelephoneNumber(String phoneNumber) {
		
		Pattern pattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		if (matcher.find()) {
			return true;
		}
		
		return false;
	}

}
