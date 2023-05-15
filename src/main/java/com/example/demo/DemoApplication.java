package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Packman pack =  new Packman();
		MarioGame mario =  new MarioGame();
		GameRunner gamerun = new GameRunner(mario);
		gamerun.run();
	}

}
