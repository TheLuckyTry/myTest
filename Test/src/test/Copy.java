package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Copy {
	
	 public static void copyFile(String oldPath,String newPath){
	        FileWriter fw = null;
	        BufferedReader br = null;
	        try {
	            fw = new FileWriter(oldPath, true);
	            br = new BufferedReader(new InputStreamReader(
	                    new FileInputStream(newPath), "UTF-8"));
	            String line = null;
	            while ((line = br.readLine()) != null) {
	                 //System.out.println("文件内容: " + line);
	                fw.write(line);
	                fw.flush();
	            }
	            br.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (fw != null) {
	                try {
	                    fw.close();
	                } catch (IOException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	

	public static void main(String[] args) {
		for(int i=0;i<120;i++){
		copyFile("C:/fakepath/2222.xlsx", "C:/fakepath/11.xlsx");}
		System.out.println("复制完毕");

	}

}
