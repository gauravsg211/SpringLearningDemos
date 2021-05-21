import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class DateTest {
	public static void main(String args[]) {

		Date date = new Date();
		
		System.out.println(date.toInstant().atZone(ZoneId.of("UTC+05:30")));
		System.out.println(Date.from(date.toInstant()));
		System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSS").format(new Date()));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS").format(new Date()));
		LocalDateTime l=LocalDateTime.now(ZoneId.of("UTC+05:30"));
		Date date2=Date.from(l.atZone(ZoneId.of("UTC+05:30")).toInstant());
		System.out.println(date2);




	}
}
