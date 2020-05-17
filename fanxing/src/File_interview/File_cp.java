package File_interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_cp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File file1 = new File("C:\\Users\\Administrator\\Desktop\\2.txt");
	     File file2 = new File("C:\\Users\\Administrator\\Desktop\\3.txt") ;
	     if(!file1.exists() && file1.isFile()){
	         file1.createNewFile();
	     }
	     if(!file2.exists() && file2.isFile()){
	         file2.createNewFile();
	     }
	     FileInputStream fis = new FileInputStream(file1);
	     FileOutputStream fos = new FileOutputStream(file2);
	     int len=-1;
	     byte [] b=new byte[(int) file1.length()];
	     while ((len=fis.read(b))!=-1){
	         fos.write(b);
	     }
	     fos.flush();
	     fos.close();
	     fis.close();
	}

}
