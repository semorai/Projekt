import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    int punktid = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button0;
        Button button1;

        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane, 800, 650);

        VBox left = new VBox();

        left.setPrefSize(100, 100);
        left.setTranslateY(35);
        left.setTranslateX(35);

        button0 = new Button();
        button0.setPrefSize(100, 100);
        button0.setText("punktid");

        button1 = new Button();
        button1.setPrefSize(100, 100);
        button1.setText("Levelup");

        button1.setOnAction(event -> {
                    double count = 0;
                    punktid++;
                    button0.setText("" + punktid);

            if (punktid >= 2 && punktid < 15) {
                        punktid = punktid +2;
                        button0.setText("" + punktid);

            }
            else if (punktid >= 15 && punktid < 50) {
                punktid = punktid +5;
                button0.setText("" + punktid);
                System.out.println(punktid);
            }
            else if (punktid >= 50 && punktid < 70)  {
                punktid = punktid +10;
                button0.setText("" + punktid);
                System.out.println(punktid);
            }
            else if (punktid >= 60)  {
                punktid = punktid +20;
                button0.setText("" + punktid);
                System.out.println(punktid);
            }

            else {
                System.out.println("Nothing can be added");

            }
            }
        );

        left.getChildren().addAll(button1);

        VBox setCenter = new VBox();

        setCenter.setPrefSize(60, 60);
        setCenter.setTranslateY(100);
        setCenter.setTranslateX(100);

        setCenter.getChildren().addAll(button0);

        bPane.setLeft(left);
        bPane.setCenter(setCenter);

        primaryStage.setTitle("Kliki mind");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}



