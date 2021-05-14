
import java.net.*;
import java.io.*;

class MaxNumServer{
	public static void main(String [] args){
		
		try{
				//Step - 1  2  3Socket bind listen
				ServerSocket ss = new ServerSocket(50001);
				while(true){			
					//Step - 4 accept
					Socket s  = ss.accept();
					InputStream is = s.getInputStream();
					OutputStream os = s.getOutputStream();
					//Step - 5 read/recieve
					DataInputStream dis=new DataInputStream(is);
					double d1  = Double.parseDouble(dis.readUTF());
					double d2  = Double.parseDouble(dis.readUTF());
					String op  = dis.readUTF();
					//Step - 6 process		
					double ans=0;
					if(d1>d2){
						ans = d2;
					}		
					else
					{
						ans=d1;
					}
					//step-7 send/write
					DataOutputStream dos=new DataOutputStream(os);  
					dos.writeUTF(""+ans);
					dos.flush();				
					//Step - 8 close
					s.close();		
				}
		}catch(UnknownHostException unhe){
			unhe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}