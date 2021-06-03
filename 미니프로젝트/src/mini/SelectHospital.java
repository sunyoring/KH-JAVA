package mini;

import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SelectHospital extends JPanel { // 병원 선택 화면 패널

	private boolean isSelectHospital = true;
	// 병원화면인지 아닌지 확인해주는 변수 true일 경우 병원 화면을 띄워줌. 예약하기 진입시 true로 변경해주는 식으로 구성

	String header[] = {"병원 이름","잔여 백신 재고","신청 가능"}; //표의 윗 부분
	String[][] hospital = { { "A병원", "150개", "O" }, { "B병원", "0개", "X" } ,{"C병원", "100개","O"}
	,{"D병원", "100개","O"},{"E병원", "100개","O"}
	}; //표 중간에 들어갈 내용

	private JTable table = new JTable(hospital,header); // 병원의 이름,재고,신청가능여부를 보여줄 표

	public void setSelectHospital(boolean isSelectHospital) {
		this.isSelectHospital = isSelectHospital;
	}

	public SelectHospital() {
		setVisible(true);
		setLayout(null);

		Choice choice = new Choice();// 드롭다운 (지역 선택)
		choice.add("서울 서대문구");
		choice.add("경기도 고양시");
		choice.add("부산 해운대구");
		choice.setBounds(50, 80, 120, 100);

		add(choice);

		table.setRowHeight(50);
		table.setVisible(false);
		JScrollPane jscp = new JScrollPane(table); //table은 이런식으로 넘겨줘야 정상출력된다.
		jscp.setLocation(250,80);
		jscp.setSize(500,270);
		add(jscp);
		
		choice.addMouseListener(new MouseAdapter() { // 지역선택시 이벤트
			
			
			@Override
			public void mousePressed(MouseEvent e) {

				switch (choice.getSelectedItem()) { // 초이스 된 아이템의 정보를 가져온다.
				case "서울 서대문구":
					// 신촌세브란스병원의 재고 현황 출력
					table.setVisible(true);
					
					break;
				case "경기도 고양시":
					// 일산백병원의 재고 현황 출력
					break;
				case "부산 해운대구":
					// 인제대해운대백병원의 재고 현황 출력
					break;

				}
			}

		});
		
		
		

	}

}
