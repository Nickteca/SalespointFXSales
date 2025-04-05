package com.salespoint.www;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MiApp extends Application {
	private ConfigurableApplicationContext context;

	@Override
    public void init() {
        context = new SpringApplicationBuilder(SalespointFxSalesApplication.class).run();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/miVista.fxml"));
        loader.setControllerFactory(context::getBean);  // Inyecta controladores desde Spring
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public void stop() {
        context.close();
    }

}
