module com.uiejemplos.hola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.hola to javafx.fxml;
    exports com.uiejemplos.hola;
}