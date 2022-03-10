package file.input.work;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils {
	public static byte[] streamTobyteArray(InputStream inputStream) throws IOException {
		byte[] buff = new byte[1024];
		ByteArrayOutputStream boStream = new ByteArrayOutputStream();
		int len;
		while ((len = inputStream.read(buff)) != -1) {
			boStream.write(buff, 0, len);
		}
		byte[] bs = boStream.toByteArray();
		boStream.close();
		return bs;
	}

	public static String streamToString(InputStream in) throws IOException {
		StringBuilder sBuilder = new StringBuilder();
		InputStreamReader iReader = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(iReader);
		String line;
		while ((line = bReader.readLine()) != null) {
			sBuilder.append(line + "\r\n");
		}

		return sBuilder.toString();
	}

}
