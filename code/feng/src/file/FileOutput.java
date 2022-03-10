package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileOutput {
	public static void main(String[] args) throws IOException {
		String path = "E:\\1.txt";
//		try(InputStream input = FileOutput.class.getResourceAsStream(path)){
//			byte[] b = new byte[10];
//			System.out.println(input.read(b));
//		}
//		Reader reader = new FileReader(path);
//		for(;;) {
//			int n = reader.read();
//			if(n!=-1) {
//				System.out.print((char)n);
//			}
//		}
//		try(Reader reader = new FileReader(path)){
//			char[] buffer = new char[100];
//			int n;
//			if((n=reader.read(buffer))!=-1) {
//				System.out.print((char)n);
//			}
//		}
//		try(Reader reader = new StringReader(path)){
//			int n = reader.read();
//			if(n!=-1) {
//				System.out.println();
//			}
//		}
//		try(Writer writer = new FileWriter(path)){
//			writer.append("fengxingyu");
//			writer.append("niha");
//			writer.write("张国荣");
//		}
//		
//		try(Reader reader = new InputStreamReader(new FileInputStream(path))){
//			for(;;) {
//				int n = reader.read();
//				if(n!=-1) {
//					System.out.print((char)n);
//				}
//			}
//		}

		BufferedReader buff = null;
		buff = new BufferedReader(new FileReader(path));// 将字节流转换为字符流，然后放入缓存中
		String str;
		System.out.println("begin");
//		System.out.println("input:");
//		str = buff.readLine();
		while ((str = buff.readLine()) != null) {
			str = buff.readLine();
			System.out.println(str);
		}
	}

}
