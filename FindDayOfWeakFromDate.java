import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Calender {
    public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = StudentVerificationController.findDay(month, day, year);
		System.out.println(res);
		bufferedReader.close();
	}

	public static String findDay(int month, int date, int year) {
		LocalDate localDate = LocalDate.of(year, month, date);
		java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		String day = null != dayOfWeek 
				? dayOfWeek.toString().toUpperCase() 
				: "";
		return day;
	}
}
