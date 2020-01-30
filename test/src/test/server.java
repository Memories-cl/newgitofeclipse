package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(9000);
		Socket socket = server.accept();
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		dos.writeUTF(str);
		
		
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		System.out.println(dis.readUTF());
		
	}
}
