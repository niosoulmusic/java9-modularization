module academy.riccio.ui {

    requires javafx.fxml;
    requires javafx.controls;


    requires academy.riccio.db;

    exports academy.riccio.ui to javafx.graphics;
    opens academy.riccio.ui to javafx.fxml;
}