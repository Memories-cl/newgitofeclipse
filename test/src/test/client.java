package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		

		
		Socket socket = new Socket("localhost",9000);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("我是客户端 你好呀"+"ss");
		
		
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		System.out.println(dis.readUTF());
	}
}
