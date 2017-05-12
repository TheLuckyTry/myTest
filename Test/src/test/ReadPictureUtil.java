package test;
/**
 * 复制整个文件夹
 * 
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadPictureUtil {

	public static void copyFolder(String oldPath, String newPath) { 
       long start=System.currentTimeMillis();
		try { 
		(new File(newPath)).mkdirs(); //如果文件夹不存在 则建立新文件夹 
		File a=new File(oldPath); 
		String[] file=a.list(); 
		
		File temp=null; 
		for (int i = 0; i < file.length; i++) { 
		if(oldPath.endsWith(File.separator)){ 
		temp=new File(oldPath+file[i]); 
		} 
		else{ 
		temp=new File(oldPath+File.separator+file[i]); 
		} 

		if(temp.isFile()){ 
		FileInputStream input = new FileInputStream(temp); 
		FileOutputStream output = new FileOutputStream(newPath + "/" + 
		(temp.getName()).toString()); 
		byte[] b = new byte[1024 ]; 
		int len; 
		while ( (len = input.read(b)) != -1) { 
		output.write(b, 0, len); 
		} 
		output.flush(); 
		output.close(); 
		input.close(); 
		} 
		if(temp.isDirectory()){//如果是子文件夹 
		copyFolder(oldPath+"/"+file[i],newPath+"/"+file[i]); 
		} 
		} 
		System.out.println("用时： "+(System.currentTimeMillis()-start+"ms"));
		//20:4752ms 10:5028ms
		} 
		
		
		catch (Exception e) { 
		System.out.println("复制整个文件夹内容操作出错"); 
		e.printStackTrace(); 

		} 

		}
	
	public static void main(String[] args) {
		
		copyFolder("E:/迅雷下载/apache-tomcat-8.0.39", "C:/test1");
		
		
	}
}
