package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SenderA {
	public static void main(String[] args) throws IOException {
		System.out.println("这里是发送端A");
		// 创建监听端口
		DatagramSocket socket = new DatagramSocket(9998);
		byte[] buf = new byte[1024];
		int length = buf.length;
		DatagramPacket packet = new DatagramPacket(buf, length, InetAddress.getLocalHost(), 9999);
		packet.setData("b你好".getBytes());
		socket.send(packet);

		// 接收回复的消息
		DatagramPacket rPacket = new DatagramPacket(buf, length);
		socket.receive(rPacket);
		int rLength = rPacket.getLength();
		byte[] rb = rPacket.getData();
		String s = new String(rb, 0, rLength);
		System.out.println(s);
		socket.close();

	}
}
