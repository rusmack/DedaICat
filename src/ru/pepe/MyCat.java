package ru.pepe;

/**
 * Created by Rusmack McDwarf on 26.06.2015.
 */
public class MyCat {

    public int sytost=5;

    public boolean isAlive=true;

    public void feed(int count){
        if(isAlive) {
            sytost = sytost + count;
            System.out.println("Кошечка покормлена и стала толще на " + count);
        }
        else{
            System.out.println("Вы попытались покормить труп кошки, чтобы она стала толще на "+count+"\nЗачем вам нужен набитый едой труп кошки, живодер?");
        }
    }

    public void say(){
        if(isAlive){
            System.out.println("Кошечка сыта на "+sytost);

        }
        else{
            System.out.println("Кошечка долго голодала и уже умерла от истощения из-за вас, больной ублюдок");
        }
    }

    public void notFeed(){
        sytost--;
        if(sytost>0) {
            System.out.println("Кошечка голодает и ей плохо и обидно");
        }
        else{
            isAlive=false;
            System.out.println("Кошечка подохла, земля ей пухом. :(");
        }
    }
}
