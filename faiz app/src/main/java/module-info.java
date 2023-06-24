module com.example.controlebb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.faizapp to javafx.fxml;
    exports com.example.faizapp;
}