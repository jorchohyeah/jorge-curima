package main.java.resis.java;

public class Container{
    private int initSticks = 0;
    private int sticks = 0;

    int getSticks(){
        return sticks;
    }
    int getInitSticks(){
        return initSticks;
    }
    void setSticks(int ammount){
        sticks = ammount;
    }
    void takeStick(int ammount){
        sticks -= ammount;
    }
    public Container(int sticks1){
        initSticks = sticks1;
    }

}