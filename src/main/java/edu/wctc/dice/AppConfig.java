package edu.wctc.dice;

import edu.wctc.dice.iface.*;
import edu.wctc.dice.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
//    @Bean
//    public GameOutput gameOutput() {
//        //return new ConsoleOutput();
//        return new PopupOutput();
//    }
//
//    @Bean
//    public GameInput gameInput() {
//        //return new ConsoleInput();
//        return new PopupInput();
//    }
//
//    @Bean
//    public DieRoller dieRoller() {
//        return new D20();
//    }

    @Bean
    public SalesInput salesInput() {
        return new ConsoleInput();
        //return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new DetailReport();
        //return new SummaryReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FreeShipping();
        //return new FlatRateShipping();
    }
}
