module com.javarush.javarush.kaminsky {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.javarush.kaminsky to javafx.graphics;
    opens com.javarush.kaminsky to javafx.fxml;

}