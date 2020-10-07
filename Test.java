package work;

public class Test{
    public static void main(String args[]){
        CPU cpu = new CPU();
        HardDisk HD = new HardDisk();
        cpu.setSpeed(2200);
        cpu.setUt(22.23);
        HD.setAmount(200);
        HD.setLx("asd");
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }
}