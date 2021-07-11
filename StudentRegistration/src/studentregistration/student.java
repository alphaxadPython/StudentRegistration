package studentregistration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class student extends StudentInfo {

    private String regNo;
    private String region;
    private java.sql.Date BOD;
    private String gender;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getBOD() {
        return BOD;
    }

    public void setBOD(Date BOD) {
        this.BOD = BOD;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    constructor
    public student(String name, String regNo, String region, Date BOD, String gender) {
        this.name = name;
        this.regNo = regNo;
        this.region = region;
        this.BOD = BOD;
        this.gender = gender;
    }

    public void studentInfo() {
        try (Connection conn = DBconnection.getConnection()) {

            // insert query
            String query = " insert into student (fullname, region, date, gender, regno) values (?, ?, ?, ?, ?)";
            // Create the mysql insert prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, region);
            preparedStmt.setDate(3, BOD);
            preparedStmt.setString(4, gender);
            preparedStmt.setString(5, regNo);

            // Execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!" + e.getMessage());
        }
        System.out.println("Data has been sent to student tabl");
    }

}
