package com.example.demo;

public class GameRunner {

    private GameConsole   mario;


    public  GameRunner(GameConsole mario)
    {
        this.mario = mario;
    }

    public void run()
    {
        System.out.println("Running Game ..........");
        mario.up();
        mario.down();
    }

}
