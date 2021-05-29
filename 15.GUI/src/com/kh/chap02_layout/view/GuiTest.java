package com.kh.chap02_layout.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GuiTest extends JFrame{
	
	
	public GuiTest() {
		this.setBounds(300,200,400,400);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		JTextField jf = new JTextField();
		panel.add(jf);
		
		JPasswordField pw = new JPasswordField();
		panel.add(pw);
		
		JPanel panel1 = new JPanel();
		
		Image icon = new ImageIcon("images/cat.PNG").getImage().getScaledInstance(100, 100, 0);
		JLabel label = new JLabel(new ImageIcon(icon));
		JButton bt = new JButton("이미지 보기");
		
		panel1.add(label);
		panel1.add(bt);
		
		
		add(panel,BorderLayout.NORTH);
		add(panel1,BorderLayout.CENTER);
		
		bt.addActionListener(new ActionListener() {
			
			int val = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(val == 0) {
					Image icon = new ImageIcon("images/dog.PNG").getImage().getScaledInstance(100, 100, 0);
					label.setIcon(new ImageIcon(icon));
					
					val = 1;
					
				}else {
					Image icon = new ImageIcon("images.cat.PNG").getImage().getScaledInstance(100, 100, 0);
					label.setIcon(new ImageIcon(icon));
					
					val = 0;
				}
			}

		});
		
		
		jf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.print(e.getKeyChar() + " ");
				super.keyPressed(e);
			}
			
			
		});
		
		pw.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.print(e.getKeyChar() + " ");

				super.keyPressed(e);
			}
			
			
		});
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
