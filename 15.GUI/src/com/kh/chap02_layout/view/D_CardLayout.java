package com.kh.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {
	
	public D_CardLayout() {
		
		super("CardLayout");
		
		this.setBounds(300, 200, 400, 400);
		
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		//패널 만들기
		//패널은 컴포넌트 이지만 다른 컴포넌트를 포함할 수 있는 컨테이너와 같은 성격을 가지고 있다. 
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
	
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.BLUE);
		card3.setBackground(new Color(50,100,50));
		
		//메인프레임(컨테이너)에 패널 추가하기
		
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		//익명 클래스 방법 : 클래스를 정의하지 않고 필요할 때 이름없이 즉시 선언하고 인스턴스화 하여 사용하는 방법
		card1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1 ){ //좌클릭
					card.next(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
				if(e.getButton() == 3 ){ //우클릭
					card.previous(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
	
			}
			
			
		});
		card2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1 ){ //좌클릭
					card.next(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
				if(e.getButton() == 3 ){ //우클릭
					card.previous(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
				
			}
			
			
		});
		card3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1 ){ //좌클릭
					card.next(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
				if(e.getButton() == 3 ){ //우클릭
					card.previous(card1.getParent()); // 카드1번이 속해 있는 컨테이너 다음 장을 보여줌.
					
				}
				
			}
			
			
		});
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}
