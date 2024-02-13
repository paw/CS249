module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.sullivb.exercises00 to javafx.fxml;

    exports edu.sullivb.exercises00;
    exports edu.sullivb.exercises02;
    exports edu.sullivb.exercises03;
    exports edu.sullivb.exercises06;
    exports edu.sullivb.exercises07;
    exports edu.sullivb.exercises08;
    exports edu.sullivb.exercises09;
    exports edu.sullivb.exercises10;
}
