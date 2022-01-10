import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class UTCDateTime {
    public static void UTCDateTime() {

        System.out.println("IST Time is:" + new Date());

        System.out.println("UTC Time is: " + getCurrentUtcTime());
    }

    public static OffsetDateTime getCurrentUtcTime() {
        OffsetDateTime dateTime;
        dateTime = OffsetDateTime.now(ZoneOffset.UTC);
        return dateTime;
    }
}