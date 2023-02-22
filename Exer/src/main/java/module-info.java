module com.example.exercise1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise1 to javafx.fxml;
    exports com.example.exercise1;
}