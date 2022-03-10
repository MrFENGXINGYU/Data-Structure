package file.input.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTwo {
	public static void main(String[] args) throws IOException {
		System.out.println("服务器端准备就绪。。。。");
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket socket = serverSocket.accept();
		System.out.println("服务器端连接成功");

		BufferedInputStream bInputStream = new BufferedInputStream(socket.getInputStream());

		byte[] bs = StreamUtils.streamTobyteArray(bInputStream);
		String path = "C:\\Users\\美力姐姐\\Pictures\\q.jpg";
		File file = new File(path);
		BufferedOutputStream bOutputStream = new BufferedOutputStream(new FileOutputStream(file));
		bOutputStream.write(bs);
		bOutputStream.flush();
		System.out.println("图片上传完成");
		bOutputStream.close();

		// 回复收到图片
//		OutputStream oStream = socket.getOutputStream();
//		System.out.println("开始回复客户端消息。。。");
//		oStream.write("上传完成".getBytes());
//		oStream.flush();
//		socket.shutdownInput();
//		System.out.println("结束");

		OutputStream oStream = socket.getOutputStream();
		OutputStreamWriter oWriter = new OutputStreamWriter(oStream);
		BufferedWriter bWriter = new BufferedWriter(oWriter);
		bWriter.write("客户端你已经上传完成");
		bWriter.newLine();
		bWriter.close();

		oStream.close();
		bInputStream.close();
		socket.close();
		serverSocket.close();

	}
}
