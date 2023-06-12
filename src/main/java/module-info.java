module com.example.testhibgradle_jdk11_2306122138 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.testhibgradle_jdk11_2306122138 to javafx.fxml;
    exports com.example.testhibgradle_jdk11_2306122138;
}