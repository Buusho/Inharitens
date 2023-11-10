public class Computer extends  Technique{
    private  String sizeOfManitor;
    private String CPU;
    private String videoCard;

    public Computer(String name,String mark,String version,String sizeOfManitor,String CPU,String videoCard){
        super(name, mark, version);
        this.sizeOfManitor=sizeOfManitor;
        this.CPU=CPU;
        this.videoCard=videoCard;

    }
    public  void highlights(){
        System.out.println("this computer can highlights different colors");
    }

    public String getSizeOfManitor() {
        return sizeOfManitor;
    }

    public void setSizeOfManitor(String sizeOfManitor) {
        this.sizeOfManitor = sizeOfManitor;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return super.toString() + "Computer{" +
                "sizeOfManitor='" + sizeOfManitor + '\'' +
                ", CPU='" + CPU + '\'' +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }
}
