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
	public int insertDataWithStatement(Employee emp) {
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

	public static void main(String[] args) {
		DBOperations db = new DBOperations();
		Scanner sc = new Scanner(System.in);
		Employee em = new Employee();
		System.out.println("Enter id: ");
		System.out.println("Employee name");
		System.out.println("enter salary");
		System.out.println("enter ADDRESS");
		em.setId(sc.nextInt());
		em.setName(sc.nextLine());
		
		em.setSalary(sc.nextDouble());
		em.setAddress(sc.nextLine());
		
		
		
		
		
		
	}

}
