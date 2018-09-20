public class Container {
    private int initSticks = 0;
    private int sticks = 0;
    private String last;

    int getSticks() {
        return this.sticks;
    }

    int getInitSticks() {
        return this.initSticks;
    }

    String getLast() {
        return this.last;
    }

    void setLast(String playerName) {
        this.last = playerName;
    }

    void setSticks(int ammount) {
        this.sticks = ammount;
    }

    void takeStick(int ammount) {
        this.sticks -= ammount;
    }

    public Container(int sticks1) {
        this.initSticks = sticks1;
    }

}