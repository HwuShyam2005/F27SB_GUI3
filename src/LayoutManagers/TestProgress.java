package LayoutManagers;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.util.Scanner;

public class TestProgress extends JFrame{

	public static void main(String[] args) { 
		TestProgress a = new TestProgress(); 
		
	}
	TestProgress(){
		//MyFrame2 frame = new MyFrame2();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();
		JLabel label8 = new JLabel();
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel();
		JLabel label11 = new JLabel("",SwingConstants.CENTER);

//JFrame frame = new JFrame();
		this.setTitle("TEST PROGRESS");
		this.getContentPane().setBackground(new Color(0x123456));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(1000, 1000);
			
		JPanel mPanel = new JPanel();
		mPanel.setBounds(80, 20, 800, 800);
		mPanel.setLayout(null);
		this.add(mPanel);
		mPanel.setVisible(true);
		mPanel.setLayout(null);
		label1.setBackground(Color.yellow);

		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 50);
		label1.setVisible(true);
		label1.setOpaque(true);
		label1.setLayout(null);
		mPanel.add(label1);

		label2.setBackground(Color.RED);
		label2.setBounds(50, 100, 200, 50);
		label2.setVisible(true);
		label2.setOpaque(true);
		label2.setLayout(null);
		mPanel.add(label2);
			
		label3.setBackground(Color.RED);
		label3.setBounds(50, 150, 200, 50);
		label3.setVisible(true);
		label3.setOpaque(true);
		label3.setLayout(null);
		mPanel.add(label3);
			
        label4.setBackground(Color.RED);
		label4.setBounds(50, 200, 200, 50);
		label4.setVisible(true);
		label4.setOpaque(true);
		label4.setLayout(null);
		mPanel.add(label4);

		label5.setBackground(Color.RED);
		label5.setBounds(50, 250, 200, 50);
		label5.setVisible(true);
		label5.setOpaque(true);
		label5.setLayout(null);
		mPanel.add(label5);

		label6.setBackground(Color.RED);
		label6.setBounds(50, 300, 200, 50);
		label6.setVisible(true);
		label6.setOpaque(true);
		label6.setLayout(null);
		mPanel.add(label6);

		label7.setBackground(Color.RED);
		label7.setBounds(50, 350, 200, 50);
		label7.setVisible(true);
		label7.setOpaque(true);
		label7.setLayout(null);
		mPanel.add(label7);

		label8.setBackground(Color.RED);
		label8.setBounds(50, 400, 200, 50);
		label8.setVisible(true);
		label8.setOpaque(true);
		label8.setLayout(null);
		mPanel.add(label8);

		label9.setBackground(Color.RED);
		label9.setBounds(50, 450, 200, 50);
		label9.setVisible(true);
		label9.setOpaque(true);
		label9.setLayout(null);
		mPanel.add(label9);

		label10.setBackground(Color.RED);
		label10.setBounds(50, 500, 200, 50);
		label10.setVisible(true);
		label10.setOpaque(true);
		label10.setLayout(null);
		mPanel.add(label10);
			
		label11.setText("0%");
		label11.setBackground(Color.GRAY);
		label11.setForeground(Color.BLACK);
		label11.setBounds(50,550,200,50);
		label11.setVisible(true);
		label11.setOpaque(true);
		label11.setLayout(null);
		mPanel.add(label11);
		
	int input=1;

while(true) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Press Enter for 10%");
	String sent = scan.nextLine();
	
	if(input==1){
		label1.setBackground(Color.GREEN);
		label1.setVisible(true);
		label11.setText("10%");
		input++;}
	else if(input==2) {
		label2.setBackground(Color.GREEN);
		label2.setVisible(true);
		label11.setText("20%");
		input++;}
	else if(input==3) {
		label3.setBackground(Color.GREEN);
		label3.setVisible(true);
		label11.setText("30%");
		input++;}
	else if(input==4) {
		label4.setBackground(Color.GREEN);
		label4.setVisible(true);
		label11.setText("40%");
		input++;}
	else if(input==5) {
		label5.setBackground(Color.GREEN);
		label5.setVisible(true);
		label11.setText("50%");
		input++;}
	else if(input==6) {
		label6.setBackground(Color.GREEN);
		label6.setVisible(true);
		label11.setText("60%");
		input++;}
	else if(input==7) {
		label7.setBackground(Color.GREEN);
		label7.setVisible(true);
		label11.setText("70%");
		input++;}
	else if(input==8) {
		label8.setBackground(Color.GREEN);
		label8.setVisible(true);
		label11.setText("80%");
		input++;}
	else if(input==9) {
		label9.setBackground(Color.GREEN);
		label9.setVisible(true);
		label11.setText("90%");
		input++;}
	else if(input==10) {
		label10.setBackground(Color.GREEN);
		label10.setVisible(true);
		label11.setText("100%");
		System.out.println("THANK YOU");
		String exit = scan.nextLine();
		input++;
		break;}
	
}

   }
}
	


	


	

