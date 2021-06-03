package mini;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.ImageIcon;

public class GoogleAPI {

	public void downloadMap(String location) { //이미지 파일을 다운로드 받는 메소드
		String imageURL = null;
		try {
			if(location.equals("강남병원")) {
				imageURL = "https://maps.googleapis.com/maps/api/staticmap?key=AIzaSyABp_X71PUMpwCoerh_KCDCZ5FqJy3hFns&center=%EA%B0%95%EB%82%A8%EB%B3%91%EC%9B%90&zoom=15&size=500x500&scale=2";

			}
		URL url = new URL(imageURL);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(location);
		byte[] b = new byte[2048];
		int length;
		while((length = is.read(b)) != -1) {
			os.write(b,0,length);
		}
		is.close();
		os.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ImageIcon getMap(String location) { //이미지 파일을 얻어오는 메소드
		return new ImageIcon((new ImageIcon(location)).getImage().getScaledInstance(500,500, java.awt.Image.SCALE_SMOOTH));
	}
	
	public void fileDelete(String fileName) { //파일을 삭제하는 메소드
		File f = new File(fileName);
		f.delete();
	}
	
}
