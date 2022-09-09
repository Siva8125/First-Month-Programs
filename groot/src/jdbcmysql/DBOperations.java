package jdbcmysql;
import java.sql.Connection;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	public DBOperations() {
		connection=MySqlConnection.getInstance();
	}
	public int updateDataWithStatement(Employee emp) {
		int result=0;
		String query="insert into Employee values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getAddress()+" ')";
		try {
			statement=connection.createStatement();
			result=statement.executeUpdate(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updatedata(Employee emp) {
		int result=0;
		String query="update Employee set Employee name where name = emp.getName()+";
		try {
			statement=connection.createStatement();
			result = statement.executeUpdate(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	public static void main(String[] args) {
		DBOperations db = new DBOperations();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("Enter your choice =\n"+"1.Insert Employee data \n"+"2.Update Employee data ");
			int n = sc.nextInt();
			sc.nextLine();
		    Employee emp = new Employee();
		    
		    switch(n) {
		    case 1:
				System.out.println("Enter id: ");
				emp.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Employee name");
				emp.setName(sc.nextLine());
				sc.nextLine();
				System.out.println("enter salary");
				emp.setSalary(sc.nextDouble());
				sc.nextLine();
				System.out.println("enter ADDRESS");
						
				emp.setAddress(sc.nextLine());
				new DBOperations().updateDataWithStatement(emp);
				break;
								
				case 2:
			    	System.out.println("Enter id to be updated ");
					emp.setId(sc.nextInt());
					sc.nextLine();
					System.out.println("Enter name to be updated");
					emp.setName(sc.nextLine());
					sc.nextLine();
					//db.updatedata(emp);
					new DBOperations().updateDataWithStatement(emp);
					break;
					
					
		    }
		
		}
			
				
		
				
		
	}

}











