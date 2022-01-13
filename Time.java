
import java.util.*;
public class Time {
		public int setCurrentTime() {
			Calendar day = Calendar.getInstance();
			Date time = day.getTime();
			int timey =0; 
			timey= time.getHours()*100;
			timey+= time.getMinutes();
			return timey;
		}

}
