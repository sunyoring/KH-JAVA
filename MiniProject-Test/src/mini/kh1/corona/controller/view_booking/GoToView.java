package mini.kh1.corona.controller.view_booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import mini.kh1.corona.controller.hospital.HospitalExcel;
import mini.kh1.corona.controller.reservation.Reservation;
import mini.kh1.corona.controller.user.BookerList;
import mini.kh1.corona.model.vo.Booker;
import mini.kh1.corona.model.vo.HospitalVaccine;
import mini.kh1.corona.model.vo.user.User;
import mini.kh1.corona.view.InsertPage;
import mini.kh1.corona.view.LoginPage;
import mini.kh1.corona.view.SelectHospital;

public class GoToView {

	private HospitalExcel hExcel = new HospitalExcel();

	private Vector<HospitalVaccine> hospitalList = new Vector<HospitalVaccine>();

	BookerList list = new BookerList();
	ArrayList<Booker> bookerlist = list.getBookerList();
	private List<User> ulist = InsertPage.temp.getJoinlist();
	private int sn = LoginPage.getsn();
	private boolean reyn = false; // 예약이 되어있으면 true, 안되어있으면 false
	private boolean bo = SelectHospital.isBookOver;
	int vaccine;
	Reservation r = new Reservation();
	ArrayList<Booker> rlist = r.getnBookerList();

	public int go() { // vaccine : 남은 백신 수 , reyn : 예약 여부
		// 신청인원 현황 가져오기
		// 신청인원이 마감되면 진입가능

		BookerList list = new BookerList();
		ArrayList<Booker> bookerlist = list.getBookerList();

		try {
			hospitalList = hExcel.callTable();

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		String hName = "";

		// 사용자가 예약자 리스트에 있는지
		for (int i = 0; i < bookerlist.size(); i++) {
			if (ulist.get(sn).getSsn().equals(bookerlist.get(i).getSsn())) {
				reyn = true;
			}
		}

		if (reyn == true) { // 사용자가 예약자 리스트에 있고
			if (bo == true) { // 병원의 백신의 재고가 0이되어 신청이 마감되었을 때

				return 0; // 신청인원 마감, 신청함
			} else {
				return 1; // 신청인원 마감 안됨
			}
		} else {
			return 2; // 신청 안함
		}

	}
}
