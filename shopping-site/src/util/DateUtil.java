package util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		Date formattedDate = new Date();
		try {
			formattedDate = dateFormatter.parse(date);
		} catch (ParseException p) {
			System.out.println("date exception ");
		}
		return formattedDate;

	}
}
