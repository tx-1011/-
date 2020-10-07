package work;

public class CPU {
    private int speed;
    private double ut;    //使用时间

    CPU(){

    }
    CPU(int speed){
        this.speed=speed;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return speed;
    }
    CPU(double ut){
    	this.ut=ut;
    }
    void setUt(double ut){
    	this.ut=ut;
    }
    public double getUt(){
    	return ut;
    }
}