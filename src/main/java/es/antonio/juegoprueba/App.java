package es.antonio.juegoprueba;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {        
        Pane root = new Pane();
        // Crear y mostrar el escenario
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("juegoprueba");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Group groupNave = new Group();
        // Añadir cada elemento al grupo en vez del panel root
        Rectangle rectangleCuerpo1 = new Rectangle(0, 0, 48, 60);
        root.getChildren().add(rectangleCuerpo1);
        Rectangle rectangleCuerpo2 = new Rectangle(40, 50, 48, 60);
        root.getChildren().add(rectangleCuerpo2);
        rectangleCuerpo2.setFill(Color.RED);
        
        Circle circle1 = new Circle();
        root.getChildren().add(circle1);
        
        circle1.setCenterX(100.0f);
        circle1.setCenterY(100.0f);
        circle1.setRadius(30.0f);
        
        // Añadir el circulo a la pantalla
        
        // Añadir el group al root
        
        
        
        // Elementos del personaje
        Rectangle rectangleCuerpo = new  Rectangle(0, 0, 48, 60);
        Rectangle rectanglePierna1 = new Rectangle(1, 50, 10, 20);
        Rectangle rectanglePierna2 = new Rectangle(37, 50, 10, 20);
        Circle circleOjo = new Circle(32, 22,5);
        Rectangle rectanglePanuelo = new Rectangle(-1, 7, 50, 13);
        Polygon polygonPico1 = new Polygon(new double[]{
            0.0, 15.0,
            -10.0, 32.0,
            5.0, 30.0 });
        Polygon polygonPico2 = new Polygon(new double[]{
            5.0, 13.0,
            -20.0, 10.0,
            -13.0, 25.0 });

        // Colorear cada elemento
        rectangleCuerpo.setFill(Color.BLACK);    
        rectanglePierna1.setFill(Color.BLACK);    
        rectanglePierna2.setFill(Color.BLACK);    
        circleOjo.setFill(Color.WHITE);        
        rectanglePanuelo.setFill(Color.RED);
        polygonPico1.setFill(Color.RED);        
        polygonPico2.setFill(Color.RED);

        // Agrupar todos los elementos
        Group groupPerson = new Group();
        groupPerson.getChildren().add(rectangleCuerpo);
        groupPerson.getChildren().add(rectanglePierna1);
        groupPerson.getChildren().add(rectanglePierna2);
        groupPerson.getChildren().add(circleOjo);
        groupPerson.getChildren().add(rectanglePanuelo);
        groupPerson.getChildren().add(polygonPico1);
        groupPerson.getChildren().add(polygonPico2);
        
        // Posicionar el grupo en la pantalla
        groupPerson.setLayoutX(150);
        groupPerson.setLayoutY(150);
        
        // Añadir el grupo al contenedor principal
        root.getChildren().add(groupPerson);
      
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}