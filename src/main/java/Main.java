import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * Created by master on 20.09.2016.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ooo");

        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        LineChart<Number,Number> NumberLineChart = new LineChart<Number, Number>(x,y);
        XYChart.Series series1= new XYChart.Series();
        series1.setName("graph");
        ObservableList<XYChart.Data> data1 = FXCollections.observableArrayList();
        for (double X =1; X<100;X=X+0.1){

            data1.add(new XYChart.Data(    X,1/X     ));
        }
        series1.setData(data1);


        Scene scene = new Scene(NumberLineChart ,600,600);
        NumberLineChart.getData().add(series1);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
