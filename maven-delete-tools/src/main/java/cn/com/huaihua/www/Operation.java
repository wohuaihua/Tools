package cn.com.huaihua.www;

import java.io.File;
import java.util.regex.Pattern;

public class Operation {
	
	//maven仓库的地址
	private static String path="D:\\Usually\\build\\maven_Repository_3.5";
	
	//要删除文件的类型
	private static String[] patterns= {"^.*\\.lastUpdated$","^.*\\.sha1$"};
	
	public static void main(String[] args) {
		Operation.delete(new File(path));
	}
	
	
	public static void delete(File file) {
		File[] files=file.listFiles();
		for(File f:files) {
			if(!f.isDirectory()) {
				if(Operation.isDeletePatterns(f)) {
					System.out.println("删除文件: "+f);
					f.delete();
				}
			}else {
				Operation.delete(f);
			}
		}
	}
	
	public static boolean isDeletePatterns(File file) {
		for(String pattern:patterns) {
			if(Pattern.matches(pattern, file.getName())) {
				return true;
			}
		}
		return false;
	}
	
}
