import com.sun.javafx.fxml.expression.VariableExpression;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL splashResources=this.getClass().getResource("/view/SplashForm.fxml");
        Parent splashContainer=FXMLLoader.load(splashResources);
        Scene splashscene=new Scene(splashContainer);
        splashscene.setFill(Color.TRANSPARENT);
        Stage stage=new Stage(StageStyle.TRANSPARENT);
        stage.setScene(splashscene);
        stage.show();
        stage.centerOnScreen();

        /*primaryStage.setTitle("Dep-09-Text-Editor");
        primaryStage.centerOnScreen();
        Parent container= FXMLLoader.load(this.getClass().getResource("/view/TextEditorForm.fxml"));
        Scene mainscene=new Scene(container);
        primaryStage.setScene(mainscene);
        primaryStage.show();
*/
    }
}
