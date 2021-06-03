package mini;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Map extends JFrame{
	
	private JTextField textField = new JTextField(30);
	private JButton button = new JButton("검색");
	private JPanel panel = new JPanel();

	private GoogleAPI googleAPI = new GoogleAPI();
	private String location = "강남병원";
	private JLabel googleMap = new JLabel();
	

	
	
	public void setMap(String location) {
		
		googleAPI.downloadMap(location);
		googleMap.setIcon(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(BorderLayout.SOUTH,googleMap);
		pack();

	}
	
	
	
	public Map() {

		
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location));
		googleAPI.fileDelete(location);
		add(googleMap);
		
		panel.add(textField);
		panel.add(button);
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {

				setMap(textField.getText());
			}
		});
		
		
		add(BorderLayout.NORTH,panel);
		add(BorderLayout.SOUTH,googleMap);
		
		
		setTitle("병원 위치");
		setVisible(true);
		pack();
	}
	


}
