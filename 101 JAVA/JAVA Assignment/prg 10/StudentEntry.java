import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class StudentEntry extends Frame implements ActionListener
{
	Label lid , lname , lmob , laddress;
	TextField tid , tname , tmob , taddress ;
	Button submit;
	Statement st; 
	Connection con;
	StudentEntry()
	{
		lid=new Label("Student ID: ");
		lname= new Label("Student Name ");
		lmob=new Label ("Mobile : ");
		laddress = new Label("Address : ");
		tid = new TextField();
		tname = new TextField();
		tmob = new TextField();
		taddress = new TextField();
		submit = new Button("submit ");
		setLayout(new GridLayout(5,5));
		add(lid);
		add(tid);
		add(lname);
		add(tname);
		add(lmob);
		add(tmob);
		add(laddress);
		add(taddress);
		add(submit);
		submit.addActionListener(this);
		try{
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","");
			 st = con.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}
		setSize(300,300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String sql = "insert into Student(std_id , std_name , std_mob , std_address ) values(" + tid.getText() + ", ' " + tname.getText() + " ' , ' " + tmob.getText() + " ' , ' " + taddress.getText() + " ' )";
		try{
			int c = st.executeUpdate(sql);
			if(c<=0)
				throw new SQLException();
		}catch(SQLException sqle){
		sqle.printStackTrace();
	  }
	}
	
	public static void main(String [] args)
	{
		StudentEntry sd = new StudentEntry();
	}
	
}