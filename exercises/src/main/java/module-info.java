module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.sullivb.exercises00 to javafx.fxml;

    exports edu.sullivb.exercises00;
    exports edu.sullivb.exercises02;
}
