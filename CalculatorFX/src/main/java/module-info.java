module org.example.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.calculatorfx to javafx.fxml;
    exports org.example.calculatorfx;
}