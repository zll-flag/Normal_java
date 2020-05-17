package tongpeifu;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;
public class Urlstr {
	//��ȡ�����ݴ�ŵ���Ŀ¼��
	private static String savepath="E:/QQzome/";
	//�ȴ���ȡ��url
	private static List<String> allwaiturl=new ArrayList<>();
	//��ȡ����url
	private static Set<String> alloverurl=new HashSet<>();
	//��¼����url����Ƚ�����ȡ�ж�
	private static Map<String,Integer> allurldepth=new HashMap<>();
	//��ȡ�����
	private static int maxdepth=2;

	public static void main(String args[]){
		//ȷ����ȡ����ҳ��ַ���˴�Ϊ��������ҳ�ϵ�ͼ������ȥ����ҳ
		//��ַΪ http://book.dangdang.com/
		// String strurl="http://search.dangdang.com/?key=%BB%FA%D0%B5%B1%ED&act=input";
		//http://blog.csdn.net/qq_33612918/article/details/78287436?locationNum=4
		String strurl="https://www.imooc.com/";
		workurl(strurl,1);
	}

	public static void workurl(String strurl,int depth){
		//�жϵ�ǰurl�Ƿ���ȡ��
		if(!(alloverurl.contains(strurl)||depth>maxdepth)){
			//����url��ȡ���Ķ���
			try {
				URL url=new URL(strurl);
				//ͨ��url��������ҳ������
				URLConnection conn=url.openConnection();
				//ͨ������ȡ����ҳ���ص�����
				InputStream is=conn.getInputStream();
				System.out.println(conn.getContentEncoding());
				//һ�㰴�ж�ȡ��ҳ���ݣ����������ݷ���
				//�����BufferedReader��InputStreamReader���ֽ���ת��Ϊ�ַ����Ļ�����
				//����ת��ʱ����Ҫ��������ʽ����
				BufferedReader br=new BufferedReader(new InputStreamReader(is,"GB2312"));
				//���ж�ȡ����ӡ
				String line=null;
				//������ʽ��ƥ�������ȡ����ҳ������
				Pattern p=Pattern.compile("<a .*href=.+</a>");
				//����һ������������ڱ����ļ�,�ļ���Ϊִ��ʱ�䣬�Է��ظ�
				PrintWriter pw=new PrintWriter(new File(savepath+System.currentTimeMillis()+".txt"));
				while((line=br.readLine())!=null){
					//System.out.println(line);
					//��д����ƥ�䳬���ӵ�ַ
					pw.println(line);
					Matcher m=p.matcher(line);
					while(m.find()){
						String href=m.group();
						//�ҵ������ӵ�ַ����ȡ�ַ���
						//��������
						href=href.substring(href.indexOf("href="));
						if(href.charAt(5)=='\"'){
							href=href.substring(6);
						}else{
							href=href.substring(5);
						}
						//��ȡ�����Ż��߿ո���ߵ�">"����
						try{
							href=href.substring(0,href.indexOf("\""));
						}catch(Exception e){
						try{
							href=href.substring(0,href.indexOf(" "));
						}catch(Exception e1){
							href=href.substring(0,href.indexOf(">"));
						}
						}
						if(href.startsWith("http:")||href.startsWith("https:")){
							//�������ҳ���ڵ�����
							//System.out.println(href);
							//��url��ַ�ŵ�������
							allwaiturl.add(href);
							allurldepth.put(href,depth+1);
						}
					}
				}
				pw.close();
				br.close();
			}   catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����ǰurl���е�alloverurl��
			alloverurl.add(strurl);
			System.out.println(strurl+"��ҳ��ȡ��ɣ�����ȡ������"+alloverurl.size()+"��ʣ����ȡ������"+allwaiturl.size());
		}
		//�õݹ�ķ���������ȡ��������
		String nexturl=allwaiturl.get(0);
		allwaiturl.remove(0);
		workurl(nexturl,allurldepth.get(nexturl));
	}
}
