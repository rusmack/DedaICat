package ru.pepe;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws InterruptedException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFXPanel(); // this will prepare JavaFX toolkit and environment
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        String bip = new File("dunes.mp3").toURI().toString();
                        Media hit = new Media(bip);
                        MediaPlayer mediaPlayer = new MediaPlayer(hit); mediaPlayer.play();
                    }
                });
            }
        });


        System.setProperty("console.encoding","utf-8");
        MyCat c=new MyCat();
        DobriiDed deda=new DobriiDed();
        c.say();
        c.feed(2);
        c.say();
       for(int i=0; i<7; i++){
           c.notFeed();
           deda.feedKotik(c);
           Thread.sleep(2000);
           c.say();
           System.out.println("");
       }
        c.feed(3);
        c.say();
        if(c.isAlive){
            System.out.println("Ура, кот выжил после голодухи с Дедом Васей!!");

        }
        else{
            System.out.println("Кот не пережил испытаний и помощь Дедушки ему не помогла. Дед тоже умер. От горя.");
        }


    }

public void redrum(){
    while (true) {


        Scanner input = new Scanner(System.in);
        System.out.print("Describe the product: ");
        String productDescription = input.nextLine();
        System.out.println(productDescription);

        if (productDescription.equals("exit")) {
            break;
        }
    }

}
}

