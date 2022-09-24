module com.study.codingtests {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.study.codingtests to javafx.fxml;
    exports com.study.codingtests;
}