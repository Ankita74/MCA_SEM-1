import java.net.*;
import java.util.*;
import java.io.*;
class DateTimeServer{
	public static void main(String [] args){
		try{
			//Step - 1, 2, 3, Socket bind listen
			ServerSocket ss = new ServerSocket(50000);
			while(true){
				//Step-4 accept
				Socket s = ss.accept();
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				//Step-5 read
				DataInputStream dis=new DataInputStream(is);  
				
				String  str=(String)dis.readUTF();  
				System.out.println("message= "+str);
				
				//Step-6 write
				DataOutputStream dos=new DataOutputStream(os);  
				
				String d = "" + new Date();
				dos.writeUTF(d);
				//Step-7 close
				s.close();
			}
		}catch(UnknownHostException unhe){
			unhe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}