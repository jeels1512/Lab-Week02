module com.example.demo37 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.demo37 to javafx.fxml;
    exports com.example.demo37;
}