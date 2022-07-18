package controller;

import com.sun.glass.ui.Menu;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.EventListener;

public class SplashFormController {
    public Label lblStatus;

    public void initialize(){
        Timeline timeline = new Timeline();
        var Keyframe1=new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("plugin ui");
            }
        });
        var Keyframe2=new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("downloading resources");
            }
        });
        var Keyframe3=new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText("loading...");
            }
        });
        var Keyframe4=new KeyFrame(Duration.millis(3500),new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


            }
        });
        timeline.getKeyFrames().addAll(Keyframe1,Keyframe2,Keyframe3,Keyframe4);
        timeline.playFromStart();


    }
}
