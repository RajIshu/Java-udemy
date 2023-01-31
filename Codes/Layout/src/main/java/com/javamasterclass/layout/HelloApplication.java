package com.javamasterclass.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    /*
        Layout (or Layout Panes):
        ------------------------
        Layout are containers which are used for flexible and dynamic arrangements of UI controls within a
        scene graph of a JavaFX application.

        As a window is resized, the layout pane automatically repositions and resizes the nodes it contains.

        JavaFX has the following built-in layout panes:

        1) FlowPane
            - The flow pane layout wraps all the nodes in a flow whether it may be horizontal flow or it may
              be Vertical flow.
            - In case of Horizontal Flow, the layout organizes the nodes in the horizontal rows according
              to the available horizontal spaces. Wraps the nodes to the next line if the horizontal space
              is less than the total width of the nodes.

        2) HBox
            - The HBox layout arranges all the nodes in our application in a single horizontal row.

        3) VBox
            - The VBox layout arranges all the nodes in our application in a single vertical column.

        4) AnchorPane
            - The Anchor pane layout anchors the nodes in our application at a particular distance from the pane.
            - Learn More: https://o7planning.org/10645/javafx-anchorpane

        5) BorderPane
            - The Border Pane layout arranges the nodes in our application in top, left, right, bottom and center
              positions.
            - Learn More: https://o7planning.org/10629/javafx-borderpane

        6) StackPane
            - The stack pane layout arranges the nodes in our application on top of another just like in a stack.
              The node added first is placed at the bottom of the stack and the next node is placed on top of it.
            - Learn More: https://o7planning.org/10633/javafx-stackpane

        7) TilePane
            - The Tile Pane layout adds all the nodes of our application in the form of uniformly sized tiles.
            - TilePane is a container which is so similar to FlowPane. It arranges the consecutive subcomponents
              on a row, and automatically pushes the subcomponents down to next line if the current line is filled
              up. However, it differs from FlowPane because the subcomponents lie on the same size cell.
            - Learn More: https://o7planning.org/10643/javafx-tilepane

        8) GridPane
            - The Grid Pane layout arranges the nodes in our application as a grid of rows and columns.
            - GridPane is a container which divides its surface into a grid, including rows and columns.
              Each position in a GridPane is called a 'cell'.
              A subcomponent can lie on a cell or a merged cell from the next cells.
            - The row can be as tall as the tallest control it contains.
              The column can be as wide as the widest control it contains.
            - Learn More: https://o7planning.org/10641/javafx-gridpane


        Preferred Size:
        --------------
        - It is the minimum size of the control or pane under which it's children can accommodate.
        - Preferred Size is used to determine


    */

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 275);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}