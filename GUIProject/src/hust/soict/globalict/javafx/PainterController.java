package hust.soict.globalict.javafx;


import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class PainterController {

    @FXML
    private VBox drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	((Object) drawingAreaPane).getChildren().clear();

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX());
    	event.getY() , 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);
    	

    }

}
