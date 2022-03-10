package file.upload.dowmload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import file.input.work.StreamUtils;

public class FileUpLoad {
	public static void fileUpload(String pathname) throws IOException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 10000);
		InputStream inStream = socket.getInputStream();
		OutputStream outStream = socket.getOutputStream();

		File file = new File(pathname);
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bInputStream = new BufferedInputStream(fileInputStream);
		byte[] bs = StreamUtils.streamTobyteArray(bInputStream);
		outStream.write(bs);

	}
}
