package http.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class One {
	public static void main(String[] args) throws IOException {
		InetAddress localhost = InetAddress.getLocalHost();
		System.out.println(localhost);
		InetAddress host1 = InetAddress.getByName("DESKTOP-UMSO4AU");
		System.out.println(host1);

	}
}
