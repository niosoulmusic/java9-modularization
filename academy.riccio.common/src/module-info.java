module academy.riccio.common {
    requires javafx.base;
    requires java.sql;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports academy.riccio.common;
    opens academy.riccio.common to javafx.base;
}