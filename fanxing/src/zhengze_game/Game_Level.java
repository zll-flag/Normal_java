package zhengze_game;

import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game_Level {
	public static void workurl(String strurl) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL(strurl) ;
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader BR = new BufferedReader(new InputStreamReader(is,"utf-8"));
			String line = null ;
			Pattern p1 = Pattern.compile("积分 (.*?), 距离下一级还需");
			while((line = BR.readLine())!= null) {
				System.out.println(line);
				//System.out.println("ok");
				Matcher m1 = p1.matcher(line);
				//System.out.println(m1.find());
				while(m1.find()) {
					
					System.out.println("ok");
					System.out.println(m1.group());
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
//	    File file = new File("C:\\Users\\Administrator\\Desktop\\1.txt");
//	    FileReader reader = new FileReader(file);
//	    BufferedReader br = new BufferedReader(reader);
//	    String line = null;
//	    while((line = br.readLine()) != null){
//	        String Line1 = line.substring(0, line.indexOf("-"));
//	        String strurl = "https://www.mcbbs.net/home.php?mod=space&username=" + Line1 ;
//			workurl(strurl);
//			System.out.println(strurl);
//	    }
//	    br.close();
		workurl("https://www.mcbbs.net/home.php?mod=space&username=momoqUe");
	}
}
