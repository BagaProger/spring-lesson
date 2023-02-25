package com.kwazart.simple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Camera {

    private CameraRoll cameraRoll;

    @Autowired
    @Qualifier("blackAndWhiteRoll")
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhoto(){
        System.out.println("Click!");
        cameraRoll.processing();
    }
}


