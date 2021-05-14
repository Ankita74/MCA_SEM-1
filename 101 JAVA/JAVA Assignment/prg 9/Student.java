import java.sql.*;

class Student{
	public static void main(String [] args){
		try{
		
			Class c = Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","");
		
			Statement st = con.createStatement();
			
			String sql = "select * from student";
			ResultSet rs = st.executeQuery(sql);
		
			
			while(rs.next()){
				System.out.println("Sudent id:-" + rs.getString("std_id") + "  Student Name:-" + rs.getString("std_name") + "  Student Mobile:-" + rs.getString("std_mob") +"  Student Address:-" + rs.getString("std_address"));
			}
		
		 rs.close();
		 st.close();
		 con.close();
			
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
