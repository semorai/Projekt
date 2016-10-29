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
    int punktid = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

    Button button1;
    Button button2;
    Button button3;


    BorderPane bPane = new BorderPane();
    Scene scene = new Scene(bPane, 800, 500);



    VBox left = new VBox();

    left.setPrefSize(100, 100);
        left.setTranslateY(35);
        left.setTranslateX(35);

        button1 = new Button();
        button1.setPrefSize(100, 100);
        button1.setText("Level1");
            button1.setOnAction(event -> {
                int count = 0;
                count++;
                System.out.println(count);
                punktid++;
                button1.setText("" + punktid);

                }
            );

    left.getChildren().addAll(button1);

    VBox setCenter = new VBox();

    setCenter.setPrefSize(60, 60);
        setCenter.setTranslateY(100);
        setCenter.setTranslateX(100);

        button2 = new Button();
        button2.setPrefSize(100, 100);
        button2.setText("Level2");


    setCenter.getChildren().addAll(button2);

    //border.setRight(sisu);

    bPane.setLeft(left);
    bPane.setCenter(setCenter);




    primaryStage.setTitle("Kliki mind");
    primaryStage.setScene(scene);
    primaryStage.show();



        }



}
