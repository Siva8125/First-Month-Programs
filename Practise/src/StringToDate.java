import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {

	public static void main(String[] args) {
		String stringdate = "2022-09-22";
		LocalDate date = LocalDate.parse(stringdate, DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}

}
