package http.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Myclient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
//		String address = "192.168.137.1";
//		Socket socket1 = new Socket(address, 9999);
		System.out.println("client尝试连接。。。。");
		System.out.println("client " + socket.getClass());
		// 字符流
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bufferedWriter.write("服务器你好！！！");
		bufferedWriter.newLine();
		bufferedWriter.flush();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String readlen = null;
		readlen = bufferedReader.readLine();
		System.out.println(readlen);

		// 字节流
//		OutputStream outputStream = socket.getOutputStream();
//		outputStream.write("hello server!!!".getBytes());
//		socket.shutdownOutput();
//		InputStream inputStream = socket.getInputStream();
//		byte[] buff = new byte[1024];
//		int len = 0;
//		while((len=inputStream.read(buff))!=-1)
//		{
//			System.out.println(new String(buff, 0, len));
//		}
//		inputStream.close();
//		outputStream.close();
//		bufferedReader.close();
		bufferedWriter.close();
		bufferedReader.close();
		socket.close();
		System.out.println("客户端断开连接");
	}
}
