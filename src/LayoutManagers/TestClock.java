package LayoutManagers;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.border.Border;
import javax.swing.JLabel;

public class TestClock extends JFrame {
	public static void main(String[] args) {
		TestClock name = new TestClock();
	}

	TestClock() {
		Border border = BorderFactory.createLineBorder(Color.green, 4); // BODER COLOUR AND SIZE
		JLabel hLabel = new JLabel(); // INITIALIZING HOUR LABEL
		JLabel mLabel = new JLabel(); // INITIALIZING MINUTE LABEL
		JLabel sLabel = new JLabel(); // INITIALIZING SECOND LABEL
		JLabel ampmLabel = new JLabel(); // INITIALIZING AM PM LABEL

//HOUR LABEL
		hLabel.setText("HH");
		hLabel.setHorizontalTextPosition(JLabel.LEFT);
		hLabel.setVerticalTextPosition(JLabel.TOP);
		hLabel.setForeground(new Color(0x00FF00));
		hLabel.setFont(new Font("Italic serif", Font.PLAIN, 36));
		hLabel.setBorder(border);
		hLabel.setVerticalAlignment(JLabel.TOP);
		hLabel.setHorizontalAlignment(JLabel.LEFT);

//MINUTE LABEL
		mLabel.setText("MM");
		mLabel.setHorizontalTextPosition(JLabel.CENTER);
		mLabel.setVerticalTextPosition(JLabel.TOP);
		mLabel.setForeground(new Color(0x00FF00));
		mLabel.setFont(new Font("Italic serif", Font.PLAIN, 36));
		mLabel.setBorder(border);
		mLabel.setVerticalAlignment(JLabel.TOP);
		mLabel.setHorizontalAlignment(JLabel.CENTER);

//SECOND LABEL
		sLabel.setText("SS");
		sLabel.setHorizontalTextPosition(JLabel.RIGHT);
		sLabel.setVerticalTextPosition(JLabel.TOP);
		sLabel.setForeground(new Color(0x00FF00));
		sLabel.setFont(new Font("Italic serif", Font.PLAIN, 36));
		sLabel.setBorder(border);
		sLabel.setVerticalAlignment(JLabel.TOP);
		sLabel.setHorizontalAlignment(JLabel.RIGHT);

//AM PM LABEL
		ampmLabel.setText("AM_PM");
		ampmLabel.setHorizontalTextPosition(JLabel.LEFT);
		ampmLabel.setVerticalTextPosition(JLabel.TOP);
		ampmLabel.setForeground(new Color(0x00FF00));
		ampmLabel.setFont(new Font("Italic serif", Font.PLAIN, 36));
		ampmLabel.setBorder(border);
		ampmLabel.setVerticalAlignment(JLabel.CENTER);
		ampmLabel.setHorizontalAlignment(JLabel.CENTER);

//JFRAME CREATION
		this.setTitle("TEST_CLOCK");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(700, 700);
		this.getContentPane().setBackground(new Color(0x123456));
//ADDING LABELS AND SETTING ITS VISIBILITY TO TRUE
		this.add(hLabel);
		this.setVisible(true);
		this.add(mLabel);
		this.setVisible(true);
		this.add(sLabel);
		this.setVisible(true);
		this.add(ampmLabel);
		this.setVisible(true);
	

		while (true) {
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR);
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			String ampm;
			if (cal.get(Calendar.AM_PM) == 0) {
				ampm = "AM";
				ampmLabel.setText("AM");
			} else {
				ampm = "PM";
				ampmLabel.setText("PM");
			}
			hLabel.setText(String.valueOf(hour));
			mLabel.setText(String.valueOf(minute));
			sLabel.setText(String.valueOf(second));
			ampmLabel.setText(String.valueOf(ampm));
		}
	}
}
