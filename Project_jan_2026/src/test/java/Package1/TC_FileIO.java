package Package1;


import java.io.FileInputStream;
import java.io.IOException;

public class TC_FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Ravindra.5.Kumar\\git\\Jan2026\\Project_jan_2026\\src\\test\\java\\Package1\\sampleinput.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
		
		fis.close();
		

	}

}
