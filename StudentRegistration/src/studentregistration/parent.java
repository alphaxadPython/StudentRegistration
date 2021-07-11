package studentregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class parent extends StudentInfo {

    private String relation;
    private String phone;
    private String email;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//constructor
    public parent(String name, String relation, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.phone = phone;
        this.email = email;
    }
    
//    register Parent Info here
    public void perentInfo(){
          try (Connection conn = DBconnection.getConnection()) {

            // insert query
            String query = " insert into parent (student, fullname, realation, phone, email) values (?, ?, ?, ?, ?)";
            // Create the mysql insert prepared statement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, relation);
            preparedStmt.setString(4, phone);
            preparedStmt.setString(5, email);

            // Execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Cannot connect the database!" + e.getMessage());
        }
        System.out.println("Data has been sent to parent table");
    }

}
