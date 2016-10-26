import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Jürgen on 25/10/2016.
 */
public class Mang extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    Button button1;
    Button button2;
    Button button3;


    BorderPane bPane = new BorderPane();
    Scene scene = new Scene(bPane, 800, 500);



    VBox left = new VBox();

    left.setPrefSize(60, 60);
        left.setTranslateY(35);
        left.setTranslateX(35);

        button1 = new Button();
        button1.setPrefSize(25, 25);
        button1.setText("Level1");
            button1.setOnAction(event -> {
                int count = 0;
                count++;
                System.out.println(count);

                }
            );

    left.getChildren().addAll(button1);





    //border.setCenter(sisu);
    //border.setRight(sisu);

    bPane.setLeft(left);




    primaryStage.setTitle("Kliki mind");
    primaryStage.setScene(scene);
    primaryStage.show();



        }



}
