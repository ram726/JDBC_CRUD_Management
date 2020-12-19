import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Update Student");
			System.out.println("Press 5 to Exit App");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add student
				System.out.println("Enter Student Name: ");
				String name=br.readLine();
				System.out.println("Enter Student Phone: ");
				String phone=br.readLine();
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				
				//create student object to store student
				
				Student st=new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is Added Sucessfully...!");
					
				}
				
				else
				{
					System.out.println("Something went wrong try again..!");
				}
				System.out.println(st);
			}
			else if(c==2) 
			{
				//delete student
				System.out.println("Enter Student Id To Delete a Student Record: ");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				
				if(f) {System.out.println("Student Record deleted with id: "+userId);}
				else {System.out.println("Something went wrong, please try again..!");}
			}
			else if(c==3)
			{
				//dispaly student
				StudentDao.showAllStudent();
			}
			else if(c==4)
			{
				//update student
				System.out.println("Enter Student Id To Update a Student Record: ");
				int userId=Integer.parseInt(br.readLine());
				int id=userId;
				System.out.println("Enter Student Name: ");
				String name=br.readLine();
				System.out.println("Enter Student Phone: ");
				String phone=br.readLine();
				System.out.println("Enter Student City: ");
				String city=br.readLine();
				Student st=new Student(name,phone,city,id);
				boolean f=StudentDao.updateStudent(st);
				if(f) {System.out.println("Student Record is Updated with id: "+userId);}
				else {System.out.println("Something went wrong, please try again..!");}
			}
			else if(c==5)
			{
				//exit
				break;
			}
			else
			{
				System.out.println("Wrong Input, Please choose above option!");
			}
		}
		System.out.println("Thankyou for using my Application");
		System.out.println("See You Soon.. bye bye!!");
	}
}
