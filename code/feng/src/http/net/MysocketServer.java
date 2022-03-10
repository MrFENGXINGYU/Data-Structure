package http.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MysocketServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
//		监听9999端口 ，等待连接
		System.out.println("监听9999端口，等待连接.....");
		Socket socket = serverSocket.accept();
		System.out.println("连接成功");
		// 字符流
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String readlen;
		readlen = bufferedReader.readLine();
		System.out.println(readlen);

		System.out.println("======");
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		System.out.println("准备写入");
		bufferedWriter.write("客户端你好！！！");
		System.out.println("写入完成");
		bufferedWriter.newLine();
		bufferedWriter.flush();

		bufferedWriter.close();
		bufferedReader.close();

//		字节处理
//		InputStream inputStream = socket.getInputStream();
//		byte[] buff = new byte[1024];
//		int len = 0;
//		while((len = inputStream.read(buff))!=-1)
//		{
//			System.out.println("服务器端  " + new String(buff, 0, len));
//		}
//		OutputStream outputStream = socket.getOutputStream();
//		outputStream.write("hello client".getBytes());
//		socket.shutdownOutput();
//		outputStream.close();

//		inputStream.close();
		socket.close();
//		serverSocket.close();
	}
}
