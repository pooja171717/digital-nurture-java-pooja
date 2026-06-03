import java.sql.*;

class StudentDAO
{
    public static void main(String[] args)
    {
        try
        {
            Connection con =
            DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb",
            "root",
            "root");

            PreparedStatement ps1 =
            con.prepareStatement(
            "insert into students values(?,?)");

            ps1.setInt(1,101);
            ps1.setString(2,"Ravi");

            ps1.executeUpdate();

            PreparedStatement ps2 =
            con.prepareStatement(
            "update students set name=? where id=?");

            ps2.setString(1,"Kumar");
            ps2.setInt(2,101);

            ps2.executeUpdate();

            System.out.println("Record Inserted and Updated");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}