package pachong_book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeiXin_book {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strurl = "https://weread.qq.com/web/category/all" ;
		workurl(strurl);
	}
	public static void workurl(String strurl) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL(strurl) ;
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
			String line = null ;
			Pattern p1 = Pattern.compile("<p class=\"wr_bookList_item_title\">(.*?)</p><p class=\"wr_bookList_item_author\"");
			while((line = br.readLine())!= null) {
				Matcher m1 = p1.matcher(line);
				int i = 0 ;
				while(m1.find()) {
					++i;
					System.out.println(m1.group().replace("<p class=\"wr_bookList_item_title\">", "title"+i+" : ").replace("</p><p class=\"wr_bookList_item_author", " "));
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
}
