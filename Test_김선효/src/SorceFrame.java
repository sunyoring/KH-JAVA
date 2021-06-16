import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SorceFrame extends JFrame{
	
	JLabel title = new JLabel("점수를 입력하세요");
	
	JLabel sum = new JLabel("총합 : ");
	JLabel avg = new JLabel("평균 : ");
	JLabel java = new JLabel("자바 : ");
	JLabel sql = new JLabel("SQL : ");

	
	
	private JTextField javaScore = new JTextField();
	private JTextField sqlScore = new JTextField();
	private JTextField total = new JTextField();
	private JTextField average = new JTextField();
	
	
	
	private JButton calcBtn = new JButton("계산하기");
	

	
	public SorceFrame() {
		
		setVisible(true);
		setSize(400,300);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		title.setVisible(true);
		title.setBounds(20, 20, 300, 50);
		add(title);
		
		java.setBounds(20,60,40,30);
		add(java);
		
		javaScore.setVisible(true);
		javaScore.setSize(100,30);
		javaScore.setBounds(60, 60, 100, 30);
		add(javaScore);
		
		
		sql.setBounds(200,60,40,30);
		add(sql);
		
		
		sqlScore.setVisible(true);
		sqlScore.setSize(100,30);
		sqlScore.setBounds(240, 60, 100, 30);

		add(sqlScore);
		
		sum.setBounds(20,200,40,30);
		add(sum);
		
		
		total.setVisible(true);
		total.setSize(100,30);
		total.setBounds(60, 200, 100, 30);

		add(total);
		
		avg.setBounds(200,200,40,30);
		add(avg);
		
		average.setVisible(true);
		average.setSize(100,30);
		average.setBounds(240, 200, 100, 30);

		add(average);
	
		
		
		
		calcBtn.setVisible(true);
		calcBtn.setBounds(145, 130, 100, 30);
		calcBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
				String num1 = javaScore.getText();
				String num2 = sqlScore.getText();
				int sumValue = Integer.parseInt(num1) + Integer.parseInt(num2) ;
				int avgValue= (Integer.parseInt(num1) + Integer.parseInt(num2))/2;
				
				total.setText(Integer.toString(sumValue));
				average.setText(Integer.toString(avgValue));
				
			}
			
		});
		add(calcBtn);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new SorceFrame();
	}

}
