import java.io.*;

class FileDemo
{
	public static void main(String [] args) 
	{
		
		File f = new File(args[0]);
		if(f.isDirectory())
		{
			File dir = new File(fname);
			int fileCount = dir.list().length;
			System.out.println(" Total File : " + fileCount);
		}
		else
		{
			System.out.println("File name : " + f.getName());
			System.out.println("File Length : " + f.length());
		
		}
		
		
	}
}