
import java.net.*;
import java.io.*;
class DateTimeClient{
	public static void main(String [] args){
		try{
				//Step - 1 & 2 Socket and connect
				Socket s = new Socket("localhost",50000);
				InputStream is = s.getInputStream();
				OutputStream os = s.getOutputStream();
				
				//Step - 3 send/write
				DataOutputStream dos=new DataOutputStream(os);  
				dos.writeUTF("Give me date and time");
				
				//Step - 4 read/recieve
				DataInputStream dis=new DataInputStream(is);  
				
				String  str=(String)dis.readUTF();  
				System.out.println("DATE AMD TIME= "+str);  
								
				//Step - 5 close
				s.close();		
		}catch(UnknownHostException unhe){
			unhe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}