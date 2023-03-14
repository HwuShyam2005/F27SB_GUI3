package LayoutManagers;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.border.Border;
import javax.swing.JLabel;

public class TestClock {
public static void main (String[]args) {
MyFrame f = new MyFrame();

while(true){
Calendar cal = Calendar.getInstance();
int hour = cal.get(Calendar.HOUR);
int minute = cal.get(Calendar.MINUTE);
int second = cal.get(Calendar.SECOND);
String ampm;
if(cal.get(Calendar.AM_PM)==0) {
	ampm="AM";
	f.ampmLabel.setText("AM");
}else {
	ampm="PM";
	f.ampmLabel.setText("PM");
}
f.hLabel.setText(String.valueOf(hour));
f.mLabel.setText(String.valueOf(minute));
f.sLabel.setText(String.valueOf(second));
f.ampmLabel.setText(String.valueOf(ampm));
}
}
}
	


