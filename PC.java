package work;

public class PC{
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
    	System.out.println("CPU速度："+cpu.getSpeed());
        System.out.println("CPU使用时间："+cpu.getUt());
        System.out.println("磁盘容量："+HD.getAmount());
        System.out.println("磁盘类型："+HD.getLx());
    }

}
