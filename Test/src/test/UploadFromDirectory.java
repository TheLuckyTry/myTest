package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UploadFromDirectory {

	
	/**
	 * 获取某一路径下的所有目录及文件
	 * @param filePath
	 * @return
	 */
	public static List<String> getFiles(String filePath){
		
		List<String> fileList=new ArrayList<String>();
		
		File root =new File(filePath);
		File copyPath=new File("C:/test1");
		
		File[] files=root.listFiles();
		
		for(File file:files){
			
			if (file.isDirectory()) {
               //通过递归调用 获取所有的目录下的文件
                getFiles(file.getAbsolutePath());
    
                
            } else {
                String picturePathStr = file.getAbsolutePath().replaceAll("\\\\", "/");
                
                
                if(picturePathStr.endsWith("png")||picturePathStr.endsWith("jpg")){
                	fileList.add(picturePathStr);
                }

                
            }
		}
		
		return fileList;
	}
	

	
	public static void main(String[] args) {
		String rootPath="C:\\fakepath";
		System.out.println(rootPath);
		String newPath=rootPath.replace("\\\\", "/");
		System.out.println(newPath);
		List<String> fileList=getFiles(newPath);// C:/fakepath
		
		for(String s: fileList){
			
			System.out.println(s);
		}
		
	}
}
