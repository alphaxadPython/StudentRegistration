package studentregistration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController implements Initializable {

    @FXML
    private TextField fullname;
    @FXML
    private TextField region;
    @FXML
    private DatePicker Bdate;
    @FXML
    private ComboBox<String> gender;
    @FXML
    private TextField regNo;
    @FXML
    private TextField parentFullname;
    @FXML
    private TextField email;
    @FXML
    private ComboBox<String> relationship;
    @FXML
    private TextField phone;
    @FXML
    private TextField year;
    @FXML
    private ComboBox<String> course;
    @FXML
    private PasswordField password1;
    @FXML
    private PasswordField password2;
    @FXML
    private TabPane regTab;
    @FXML
    private Button submit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        filling the gender Combobox
        ObservableList<String> gend = FXCollections.observableArrayList(
                "Male",
                "Female"
        );
        gender.setItems(gend);

//        filling the course combobox
        ObservableList<String> couz = FXCollections.observableArrayList(
                "BIT",
                "BEF",
                "BSP",
                "BAC",
                "BCS",
                "BAIT"
        );
        course.setItems(couz);

//        flling the realtionship combobox
        ObservableList<String> rel = FXCollections.observableArrayList(
                "Mom",
                "Dady",
                "Uncle",
                "Grand",
                "Brother",
                "Sister"
        );
        relationship.setItems(rel);
    }

//    public variables to capture data from the forms
    public String studentName;
    public String studentRegion;
    public String studentRegNo;
    java.sql.Date studentBOD;
    public String studentGender;
    public String parentName;
    public String parentRelate;
    public String parentPhn;
    public String parentEmail;
    public String courseYaer;
    public String courseName;
    public String pwd1;
    public String pwd2;

//    student info seving
    @FXML
    private void saveStdentIfo(ActionEvent event) {
//        get the student information on variables
        try {
            if (fullname.getText().isEmpty() || region.getText().isEmpty() || regNo.getText().isEmpty() || Bdate.getValue().toString().isEmpty() || gender.getValue().toString().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please Fill All fields!!");
                alert.setTitle("Empty Fields");
                alert.setHeaderText(null);
                alert.showAndWait();
            } else {
                studentName = fullname.getText();
                studentRegion = region.getText();
                studentRegNo = regNo.getText();
                studentBOD = java.sql.Date.valueOf(Bdate.getValue());
                studentGender = gender.getValue().toString();

                regTab.getSelectionModel().select(1);
            }
        } catch (Exception e) {
        }

    }

//    parent info saving
    @FXML
    private void saveParentInfo(ActionEvent event) {
//        capture parent information to vaariables
        try {
            if (parentFullname.getText().isEmpty() || relationship.getValue().toString().isEmpty() || phone.getText().isEmpty() || email.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please Fill All fields!!");
                alert.setTitle("Empty Fields");
                alert.setHeaderText(null);
                alert.showAndWait();
            } else {
                parentName = parentFullname.getText();
                parentRelate = relationship.getValue().toString();
                parentPhn = phone.getText();
                parentEmail = email.getText();
                
                regTab.getSelectionModel().select(2);
            }
        } catch (Exception e) {
        }
    }

//    back to student tab
    @FXML
    private void goBackTostudent(ActionEvent event) {
        regTab.getSelectionModel().select(0);
    }

//    submitting info here
    @FXML
    private void submitInfo(ActionEvent event) {
        try {
            if (year.getText().isEmpty() || password1.getText().isEmpty() || password2.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please Fill All fields!!");
                alert.setTitle("Empty Fields");
                alert.setHeaderText(null);
                alert.showAndWait();
            } else {
                courseYaer = year.getText();
                courseName = course.getValue();
                pwd1 = password1.getText();
                pwd2 = password2.getText();

//              object to insert student details
                student newStudent = new student(studentName, studentRegNo, studentRegion, studentBOD, studentGender);
                newStudent.studentInfo();

//                object to insert new course daetail of student
                course newCourse = new course(studentName, courseYaer, courseName, pwd1);
                newCourse.courseInfo();

//                object to insert parent data
                parent newParent = new parent(studentName, parentRelate, parentPhn, parentEmail);
                newParent.perentInfo();
                // success alert
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Successfully Registered!!");
                alert.setTitle("Registered");
                alert.setHeaderText(null);
                alert.show();

//                redirect user to the
                
                 FXMLLoader form = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
                Stage stage = (Stage) submit.getScene().getWindow();
                Scene scene = new Scene(form.load());
                stage.setScene(scene);
            }
        } catch (Exception e) {
        }

    }

//    back to parent tab here
    @FXML
    private void goBackToParent(ActionEvent event) {
        regTab.getSelectionModel().select(1);
    }

}
