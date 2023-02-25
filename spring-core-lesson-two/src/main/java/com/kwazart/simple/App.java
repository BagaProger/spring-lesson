package com.kwazart.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Camera camera =context.getBean("camera",Camera.class);
        camera.doPhoto();

        CameraRGP cameraRGP = context.getBean("cameraRGP",CameraRGP.class);
        cameraRGP.doPhoto();

        ((AnnotationConfigApplicationContext ) context).close();
    }
}
