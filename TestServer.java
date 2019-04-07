import java.net.*;
import java.io.*;

class TestServer{
	public static void main(String[] args) throws Exception{
		ServerSocket s = new ServerSocket(9487);

		Socket ss;
		InputStream is;
		DataInputStream dis;
		String talk,request;
		OutputStream os;
		DataOutputStream dos;
		

		while(true){	
			ss = s.accept();
			is = ss.getInputStream();
			dis = new  DataInputStream(is);
			String clientip = ss.getRemoteSocketAddress().toString();
			System.out.println(clientip);
			int remoteport = ss.getPort();
			System.out.print(remoteport);
			talk = dis.readUTF();
			System.out.println(talk);
			
			request = "you for me message is "+talk;
			os = ss.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF(request);
			
		}		
	}
}