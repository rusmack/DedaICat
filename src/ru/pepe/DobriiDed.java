package ru.pepe;

/**
 * Created by Rusmack McDwarf on 26.06.2015.
 */
public class DobriiDed {

    int foodCountDed=4;

    public void feedKotik(MyCat acat){
        if(foodCountDed>2){
            System.out.println("Добрый дедушка Вася увидел голодающего кота и поделился с ним двумя кусками хлеба");
           acat.feed(2);
            foodCountDed-=2;

        }
        else{
            System.out.println("У Васи больше нет еды и ему нечем делится с котом");
        }
    }

}
