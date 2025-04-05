package com.salespoint.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class SalespointFxSalesApplication {

	public static void main(String[] args) {
		Application.launch(MiApp.class, args);  // Lanza JavaFX
	}

}