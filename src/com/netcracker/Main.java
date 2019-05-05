package com.netcracker;

import com.netcracker.football.AcademyFactory;
import com.netcracker.football.Player;
import com.netcracker.zoo.Zoo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        firstTask(context);
        secondTask(context);
        thirdTask(context);
        fourthTask(context);
        fifthTask(context);
        sixthTask(context);
        seventhTask(context);
    }


    private static void firstTask(ApplicationContext context){
        System.out.println("Constructor injection:");
        Player player1= (Player)context.getBean("player1");
        System.out.println(player1.toString());
        player1.getPosition().goal();
        System.out.println("_______________________________");
        System.out.println("Setter injection");
        Player player2=(Player)context.getBean("player2");
        System.out.println(player2.toString());
        player2.getPosition().redCard();
        System.out.println("_______________________________");
    }

    private static void secondTask(ApplicationContext context){
        System.out.println("Setter injection");
        Zoo zoo_limpopo=(Zoo)context.getBean("zoo_limpopo");
        System.out.println(zoo_limpopo);
        zoo_limpopo.getAnimals().get(2).info();
        System.out.println("_______________________________");
        System.out.println("Constructor injection");
        Zoo zoo_madagascar=(Zoo)context.getBean("zoo_madagascar");
        System.out.println(zoo_madagascar);
        System.out.println(zoo_madagascar.getNutrition().toString());
        System.out.println("_______________________________");
    }

    private static void thirdTask(ApplicationContext context){
        System.out.println("Bean inheritance");
        Player player1= (Player)context.getBean("topPlayer");
        System.out.println(player1.toString());
        System.out.println("_______________________________");
    }

    private static void fourthTask(ApplicationContext context){
        System.out.println("SpEL initialization");
        Player player1= (Player)context.getBean("default");
        System.out.println(player1.toString());
        System.out.println("_______________________________");
    }

    private static void fifthTask(ApplicationContext context){
        System.out.println("Autowiring ByName");
        Player player1= (Player)context.getBean("autowiring1");
        System.out.println(player1.toString());
        System.out.println("_______________________________");
        System.out.println("Autowiring Constructor");
        Player player2= (Player)context.getBean("autowiring2");
        System.out.println(player2.toString());
        System.out.println("_______________________________");
    }

    private static void sixthTask(ApplicationContext context){
        System.out.println("Factory method");
        Player player1= (Player)context.getBean("createdPlayer");
        System.out.println(player1.toString());
        System.out.println("_______________________________");
    }

    private static void seventhTask(ApplicationContext context){
        System.out.println("Lookup method");
        AcademyFactory academy = (AcademyFactory) context.getBean("academyTransfer");
        Player transferPlayer = academy.createPlayer();
        System.out.println("The player(" + transferPlayer.toString()+") was successfully transfered");

    }

}


