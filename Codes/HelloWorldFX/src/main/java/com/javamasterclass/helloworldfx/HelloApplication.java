package com.javamasterclass.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/*
    JavaFX:
    ------
    JavaFX was developed by Chris Oliver.

    Initially the project was named as Form Follows Functions (F3).

    Later, Sun Micro-systems acquired F3 project as JavaFX in June 2005.

    JavaFX is a software platform for creating and delivering desktop applications, as well as
    rich web applications that can run across a wide variety of devices.

    JavaFX was designed with the MVC, or Model-View-Controller, pattern in mind. In a
    nutshell, this pattern keeps the code that handles an application’s data separate from the
    UI code.


    Model-View-Controller (MVC):
    ---------------------------
    The Model-View-Controller (MVC) is an architectural pattern that separates an application
    into three main logical components: the model, the view, and the controller.

    Each of these components are built to handle specific development aspects of an application.

    MVC is one of the most frequently used industry-standard web development framework to create
    scalable and extensible projects.

    Three components:
    ----------------
    1) Model:
       - The Model component corresponds to all the data-related logic that the user works with.
         This can represent either the data that is being transferred between the View and
         Controller components or any other business logic-related data.

    2) View:
       - The View component is used for all the UI logic of the application.
       - Example: Text Boxes, Dropdowns, etc.

    3) Controller:
       - Controllers act as an interface between Model and View components to process all the
         business logic and incoming requests, manipulate data using the Model component and
         interact with the Views to render the final output.

    Because of this, when we're using the MVC pattern, we wouldn't mix the code that deals
    with the UI and the code that manipulates the application data in the same class. The
    controller is sort of the middleman between the UI and the data.

    When working with JavaFX, the model corresponds to the application’s data model, the
    view is the FXML, and the controller is the code that determines what happens when a
    user interacts with the Ul. Essentially the controller handles events.
*/

public class HelloApplication extends Application { // Here, Application comes from javafx.application
    /*
        JavaFX applications must have a class that extends this Application class.

        Class extending Application class will be the entrypoint for the application.

        The Application class manages the life cycle of a javafx application.

        The methods in the application class that we really care most about are the init(), start()
        and stop() methods.

        Life Cycle of JavaFX application:
        --------------------------------
        - When we run the application, application.launch will be called from the main method.

        - launch() method launches the javafx application and doesn't return until the application has exited.

        - When a javafx application is launched, the init() method runs first.

          In Application class init() method is empty, so unless we override it, it won't do anything.

        - The start() method runs right after the init() method.

          start() method also has to be overridden. As, start() method is defined as Abstract method in
          Application class.

        - When application window closes, stop() method runs. Just like init(), it is also empty in the
          Application class. So, we have to override it.


        start() method:
        --------------
        The start() method is the main entry point for all JavaFX applications.

        In general, a JavaFX application will have three major components namely Stage, Scene and Nodes.

                __________________________________________________________________
               |                              Stage                               |
               |      _____________________________________________________       |
               |     |                        Scene                        |      |
               |     |       _______________________________________       |      |
               |     |      |               Scene Graph             |      |      |
               |     |      |                                       |      |      |
               |     |      |               ___________             |      |      |
               |     |      |              | Root Node |            |      |      |
               |     |      |               -----------             |      |      |
               |     |      |                  /   \                |      |      |
               |     |      |                 /     \               |      |      |
               |     |      |                /       \              |      |      |
               |     |      |          -----------    \             |      |      |
               |     |      |         | Leaf Node |    \            |      |      |
               |     |      |          -----------      \           |      |      |
               |     |      |                      -----------      |      |      |
               |     |      |                     | Leaf Node |     |      |      |
               |     |      |                      -----------      |      |      |
               |     |      |_______________________________________|      |      |
               |     |                                                     |      |
               |     |_____________________________________________________|      |
               |                                                                  |
               |__________________________________________________________________|


        Stage:
        -----
            - A stage (a window or it extends a Window class) contains all the objects of a JavaFX application.

            - The stage is where all the visual parts of the JavaFX application are displayed.

            - It is represented by Stage class of the package javafx.stage.

            - You have to call the show() method to display the contents of a stage.

            - The primary stage is created by the platform itself.

              The created stage object is passed as an argument to the start() method of the Application class.

            - A stage has two parameters determining its position namely Width and Height.

            - Remember, we can create multiple stages (or windows), but too many windows can lead to a bad user
              experience. So, most of the applications have single window i.e., top-level window.

            - Dialogs are presented within a stage, but we don't explicitly create the stage. We use the
              dialog class which wraps the dialog into a stage for us.

              The javafx developers have said that in a future version of javafx, they may provide a lightweight
              container for dialogues rather than using a stage.

              A Dialog is a graphical element, a window that shows information to the window and receives a response.

              Example of Dialog: https://www.tutorialspoint.com/assets/questions/media/38697/dialog.jpg

        Scene:
        -----
            - A scene represents the physical contents of a JavaFX application.
            - A Scene actually holds all the nodes (like textarea, buttons, shapes, media, etc.) of a javafx
              application.

        Scene Graph:
        -----------
            - It is a collection of nodes.
            - A scene graph is a tree-like data structure (hierarchical) representing the contents of a scene.
            - A node is the element which is visualized on the stage.
              It can be any button, text box, layout, image, radio button, check box, etc.
            - There is always one root in the scene graph. This will act as a parent node for all the other
              nodes present in the scene graph.


        FXMLLoader:
        ----------
        The FXMLLoader is a class with the responsibility to parse FXML content (as XML),
        build the Scene Graph and initialise the Controller of a JavaFX View.

        FXML is an XML-based user interface markup language created by Oracle Corporation for defining the
        user interface of a JavaFX application.

        JavaFX FXML is an XML format that enables you to compose JavaFX GUIs in a fashion similar to how you
        compose web GUIs in HTML.
        FXML thus enables you to separate your JavaFX layout code from the rest of your application code.

        So, basically FXMLLoader is used to load the FXML file and create the JavaFX GUI components.

        load() method of FXMLLoader loads an object hierarchy from the FXML document.




    */

    @Override
    public void start(Stage primaryStage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);


        /*
            GridPane:
            --------
            - A JavaFX GridPane is a layout component which lays out its child components in a grid.

            - alignment: The alignment of of the grid within the gridpane's width and height.
            - Hgap: The height of the vertical gaps between rows.
            - Vgap: The width of the horizontal gaps between columns.

              Open this link to visualize the above concepts: https://github.com/RajIshu/Java-udemy/blob/master/images/login_fxml_gridlines.png

        */
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Label greeting = new Label("Welcome to JavaFX!");
        greeting.setText("Welcome Everyone to JavaFX!");
        // setText(): Sets the value of the property text.

        greeting.setTextFill(Color.GREEN);
        // setTextFill(): Sets the color of the text.

        // Here, only making the text bold (Keeping Family and size as default)
//        greeting.setFont(Font.font(greeting.getFont().getFamily(), FontWeight.EXTRA_BOLD, greeting.getFont().getSize()));

        // Here, Changing the font family to 'Times New Roman' and making text bold and size to 70
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));

        // As window size was small for the above case so let's increase the window size


        root.getChildren().add(greeting);
        // getChildren(): Gets the list of children of this Parent
        System.out.println(greeting.getFont());


        Scene scene = new Scene(root, 320, 240);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}