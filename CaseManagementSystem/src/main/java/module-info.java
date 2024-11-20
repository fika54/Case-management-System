module com.example.casemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires mysql.connector.j;
    //requires eu.hansolo.tilesfx;

    opens com.example.casemanagementsystem to javafx.fxml;
    exports com.example.casemanagementsystem;
    exports com.example.casemanagementsystem.Controller;
    opens com.example.casemanagementsystem.Controller to javafx.fxml;
}