import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC 
{
    public static void main(String[] args) 
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MY_DB","root","root");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT id,name,age FROM students");

        if(resultSet.next())
        {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            System.out.println(id + "|" + name + "|" + age );
        }

        resultSet.close();
        connection.close();
        statement.close();

    }
}
