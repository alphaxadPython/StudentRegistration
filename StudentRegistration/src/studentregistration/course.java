package studentregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class course extends StudentInfo {

    private String Year;
    private String Course;
    private String pass;

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

//    constructor for the course
    public course(String name, String Year, String Course, String pass) {
        this.name = name;
        this.Year = Year;
        this.Course = Course;
        this.pass = pass;
    }

//    register course info here
    public void courseInfo() {
        try (Connection conn = DBconnection.getConnection()) {

            // insert query
            String query = " insert into course (student, course, year, password) values (?, ?, ?, ?)";
            // Create the mysql insert prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, Course);
            preparedStmt.setString(3, Year);
            preparedStmt.setString(4, pass);

            // Execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!" + e.getMessage());
        }
        System.out.println("Data has been sent to course table");
    }

//    updating course
    public void updateCourse() {
        try (Connection conn = DBconnection.getConnection()) {

            // insert query
            String query = " update course set student=?, course=?, year=?, password=? where student=?";
            // Create the mysql insert prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, Course);
            preparedStmt.setString(3, Year);
            preparedStmt.setString(4, pass);
            preparedStmt.setString(5, name);

            // Execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!" + e.getMessage());
        }
        System.out.println("updated course");
    }

}
