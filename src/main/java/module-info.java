module com.javarush.javarush.kaminsky {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;

    exports com.javarush.kaminsky to javafx.graphics;
    opens com.javarush.kaminsky to javafx.fxml;

    exports com.javarush.kaminsky.service;
    opens com.javarush.kaminsky.service to javafx.fxml;

}