package com.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDao 
{
	public static boolean insertStudentToDB(Student st)

	{
		boolean f=false;
		try {
			
			//jdbc code
			Connection con=ConnctionProvider.crateConnection();
			String q="insert into studentmanagement.student(sid,sname,phone,scity) values(?,?,?,?)";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setInt(1, st.getStudentId());
			pstmt.setString(2, st.getStudentName());
			pstmt.setString(3, st.getStudentPhone());
			pstmt.setString(4, st.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
			
			//jdbc code
			Connection con=ConnctionProvider.crateConnection();
			String q="delete from studentmanagement.student where sid=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setInt(1, userId);
			
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudent() {
		
		try {
			
			//jdbc code
			Connection con=ConnctionProvider.crateConnection();
			String q="select * from studentmanagement.student";
			
			//Statement Interface
			Statement stmt=con.createStatement();			
			ResultSet set= stmt.executeQuery(q);
			 
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("Id:"+id);
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("================================");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	
	public static boolean updateStudent(Student st) {
		boolean f=false;
		try {
			//jdbc code
			Connection con=ConnctionProvider.crateConnection();
			String q="update studentmanagement.student set  sname= ?, phone=?, scity=? where sid=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter	
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhone() );
			pstmt.setString(3, st.getStudentCity());
			 pstmt.setInt(4,st.getStudentId());
			//execute
			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
}
  