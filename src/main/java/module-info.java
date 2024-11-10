module com.example.tp_laba2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp_laba2 to javafx.fxml;
    exports com.example.tp_laba2;
}