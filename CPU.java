package work;

public class CPU {
    private int speed;
    private double ut;    //ʹ��ʱ��

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