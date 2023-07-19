module com.example.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.fxdemo to javafx.fxml;
    exports com.example.fxdemo;
}