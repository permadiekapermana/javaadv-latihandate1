import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    public static Date createDate() {
        Date date = new Date();
		return date;		
	}

    public static void main(String[] args) {
        System.out.println(createDate());
    }
}