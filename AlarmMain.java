import java.util.*;
import java.awt.*;
import java.io.*;
public class AlarmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int timeDesired=2400;
		int currentTime = 0;
		String Path = "./A Night Alone - TrackTribe.mp3";
		File file = new File(Path);
		Scanner input = new Scanner(System.in);
		while(timeDesired%100>60||timeDesired > 2359) {
		System.out.println("What time for an alarm? (EX: 2301)");
		timeDesired = input.nextInt();
		if(timeDesired%100>60||timeDesired > 2359) {
			System.out.println("Invalid time, please enter a real time in 2400 format");
		}
		}
		int temp = timeDesired%100;
		if(timeDesired>1159) {
			if(temp > 10) {
				System.out.println("Alarm set for: "+timeDesired/100%12 +":0"+ timeDesired%100+" PM");
			}
			else {
				System.out.println("Alarm set for: "+timeDesired/100%12 +":0"+ timeDesired%100+" PM");
			}
		}
		else {
			if(temp > 10) {
				System.out.println("Alarm set for: "+timeDesired/100%12 +":0"+ timeDesired%100+" AM");
			}
			else {
				System.out.println("Alarm set for: "+timeDesired/100%12 +":0"+ timeDesired%100+" AM");
			}
		}
		Time t = new Time();
		while(currentTime != timeDesired) {
			currentTime = t.setCurrentTime();
			try {
			    Thread.sleep(500);
			} catch (InterruptedException ie) {
			    System.out.println("A fatal error has occurred.");
			    System.exit(0);
			}
		}
		System.out.println("Beep! Beep! Beep! Times up!");
		try {
		Desktop.getDesktop().open(file);
		}catch(Exception e) {
			 System.out.println("A fatal error has occurred.");
			    System.exit(1);
		}
		input.close();
	}
}
