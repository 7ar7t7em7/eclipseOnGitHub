package artHomeworkTryWithResources;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// String testString = "Example string testing my code";

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter String");
			String str = scanner.nextLine();

			// Создаем новый ByteArrayInputStream
			ByteArrayInputStream resultStream = new ByteArrayInputStream(str.getBytes());

			// Работаем с результатом
			processStream(resultStream);
		}
	}

	private static void processStream(ByteArrayInputStream stream) {
		try {
			int byteRead;
			while ((byteRead = stream.read()) != -1) {
				System.out.print((char) byteRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
