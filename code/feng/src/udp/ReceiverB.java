package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiverB {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(9999);// 创建监听端口
		System.out.println("这里是接收端B");
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);// 创建接收的数据包
		socket.receive(packet);// 将发送数据的包转存到接收数据的包
		int length = packet.getLength();// 接收到的数据的长度
		byte[] data = packet.getData();// 把接收的数据存入
		String s = new String(data, 0, length);
		System.out.println(s);

		// 开始给A回复消息
		int sendLength = buf.length;
		DatagramPacket sendPacket = new DatagramPacket(buf, sendLength, InetAddress.getLocalHost(), 9998);
		sendPacket.setData("A你好，我已经收到你发送的消息".getBytes());
		socket.send(sendPacket);
		socket.close();
	}
}
