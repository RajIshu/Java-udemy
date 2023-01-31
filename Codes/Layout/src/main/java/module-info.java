module com.javamasterclass.layout {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.javamasterclass.layout to javafx.fxml;
    exports com.javamasterclass.layout;
}