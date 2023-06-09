package isp;

import com.github.bsferreira.solid.isp.SolucionDiego.violation.CamaraSwitches;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Drone implements CamaraSwitches {

    private boolean cameraOn;

    public boolean isCameraOn() {

        return cameraOn;
    }


    @Override
    public void turnCameraOn() {

        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {

        cameraOn = false;
    }


}