package com.github.rdo201.olds;


import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.security.auth.login.LoginException;

@SpringBootApplication(scanBasePackages = "com.github.rdo201.olds")
    public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Discord ();
    }

    private static void Discord () {
        try {
            JDA jda = new JDABuilder(AccountType.BOT)
                    .setToken("NDA5NDM0ODIxMzc5NDg5Nzkz.DVhUJg.NJfeG-_1AOLoUpgcZWzoubSzH3E")           //The token of the account that is logging in.
                    .addEventListener(new Main())  //An instance of a class that will handle events.
                    .buildBlocking();  //There are 2 ways to login, blocking vs async. Blocking guarantees that JDA will be completely loaded.
        } catch (LoginException e) {
            //If anything goes wrong in terms of authentication, this is the exception that will represent it
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

