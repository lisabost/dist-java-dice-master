package edu.wctc.dice;

import edu.wctc.dice.impl.FileInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        ((DiceGame)context.getBean("diceGame")).play();

        ((GenerateReport)context.getBean("generateReport")).generateReport();
    }
}
