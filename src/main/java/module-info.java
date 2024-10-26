module com.example.week5work {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week5work to javafx.fxml;
    exports com.example.week5work;
}