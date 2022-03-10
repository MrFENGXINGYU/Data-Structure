package file.input.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTow {
	public static void main(String[] args) throws IOException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

		byte[] buff = new byte[1024];
		String path = "C:\\Users\\美力姐姐\\Pictures\\hg.jpg";
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bInputStream = new BufferedInputStream(fileInputStream);
		byte[] byteArray = StreamUtils.streamTobyteArray(bInputStream);

		InputStream iStream = socket.getInputStream();

		BufferedOutputStream bOutputStream = new BufferedOutputStream(socket.getOutputStream());
		bOutputStream.write(byteArray);
		bOutputStream.flush();
		System.out.println("上传完成");
		bInputStream.close();
		socket.shutdownInput();

		// 原始方法接收消息
//		byte[] b = new byte[1024];
//		int len ;
//		System.out.println("开始接收消息");
//		while((len=iStream.read(b))!=-1)
//		{
//			System.out.println(new String(b, 0, len));
//		}
//		System.out.println("接收完成");

		String s = StreamUtils.streamToString(iStream);// 自己写的工具类
		System.out.println(s);

		iStream.close();
		bOutputStream.close();
		socket.close();

	}
}
