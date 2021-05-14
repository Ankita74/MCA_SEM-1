import java.io.*;
import java.util.Scanner;

class FileCopy {
	public static void main(String [] args){
		try{
			if(args.length < 2){
				System.out.println("Usage: java MyCopy {[<path>]filename} {[<path>]filename}");
				System.exit(0);
			}
			Scanner sc = new Scanner(System.in);
			File sf = new File(args[0]);
			File df = new File(args[1]);
			if(!sf.exists()){
				System.out.println("File " + args[0] + " not found");
				System.exit(0);
			}
			if(df.exists()){
				System.out.println("File " + args[1] + " already exists!!! do you want ro orverwrit? (y/n)");
				String ans = sc.next();
				if(ans.compareToIgnoreCase("y")!=0){
				  System.out.println("Operation terminate");
				  System.exit(0);
				}
			}
			FileInputStream fis = new FileInputStream(sf); 
			FileOutputStream fos = new FileOutputStream(df); 
			byte [] b = new byte[500];
			int count=0;
			while((count=fis.read(b))>0){
				fos.write(b,0,count);				
			}
			fis.close();
			fos.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();			
		}catch(IOException ioe){
			ioe.printStackTrace();			
		}
	}
}