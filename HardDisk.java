package work;

public class HardDisk {
    private int amount;
    private String lx;  //”≤≈Ã¿‡–Õ
    HardDisk(){

    }
    HardDisk(int amount,String lx){
        this.lx=lx;
        this.amount=amount;
    }
    void setAmount(int amount){
        this.amount = amount;
    }
    int getAmount(){
        return amount;
    }
    void setLx(String lx){
    	this.lx=lx;
    }
    String getLx(){
    	if (lx == "SSD"||lx == "HDD"){
            return lx;
        }
        else{
            return "orther";
        }
    }
}
