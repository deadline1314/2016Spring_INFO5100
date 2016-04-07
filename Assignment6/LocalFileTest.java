package Assignment6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 4. Open a local file, read the file line by line. Each line should be imported as a
 * string and stored in ArrayList. Then print out the ArrayList reversely. You can
 * create your own file to test.
 */
public class LocalFileTest {
	
	public void printArrayListReversely(String file) throws Exception{
		ArrayList<String> res = new ArrayList<String>();
		res = readLineIntoArray(file);
		for(int i = res.size()-1; i>=0; i--){
			System.out.println(res.get(i));
		}
	}
	
	public ArrayList<String> readLineIntoArray(String file) throws Exception{
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		ArrayList<String> res = new ArrayList<String>();
		while(true){
			String line = br.readLine();
			if(line == null)
				break;
			res.add(line);
		}
		br.close();
		isr.close();
		fis.close();
		return res;
	}

	public static void main(String[] args) throws Exception{
		LocalFileTest lft = new LocalFileTest();
		lft.printArrayListReversely("/Users/workspace/JavaTest/src/Assignment6/reverse.txt");

	}

}
